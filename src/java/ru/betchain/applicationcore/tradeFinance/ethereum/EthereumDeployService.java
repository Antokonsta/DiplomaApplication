package ru.betchain.applicationcore.tradeFinance.ethereum;


import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import ru.betchain.applicationcore.tradeFinance.ethereum.contracts.ObligationsContract;
import ru.betchain.applicationcore.tradeFinance.ethereum.contracts.ShippingContract;
import ru.betchain.applicationcore.tradeFinance.ethereum.contracts.TfDealContract;
import ru.betchain.applicationcore.tradeFinance.model.Deal;
import ru.betchain.applicationcore.tradeFinance.model.PaymentObligation;
import ru.betchain.applicationcore.tradeFinance.model.Shipping;


import java.math.BigInteger;
import java.util.Random;

/**
 * Created by Anton on 20.03.18.
 * <p>
 * Service for working with Ethereum Client
 */
@Component
public class EthereumDeployService {

    private static final Logger LOGGER = Logger.getLogger(EthereumDeployService.class);

    @Autowired
    CredentialsInfo credentialsInfo;

    private static final BigInteger GAS_PRICE = BigInteger.valueOf(20_000_000_000L);
    private static final BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000);

    private static final String ethereumNodeAddress = "http://192.168.2.153:8545";


    /**
     * Deploy tf deal smart contract in ethereum blockchain
     * <p>
     *
     * @param deal
     * @return contract address
     */
    public String deployDealSmartContract(Deal deal) throws Exception {

        /* Connection to ethereum client */
        Web3j web3 = getEthereumConnection();
        /* Get credentials of main wallet */
        Credentials credentials = credentialsInfo.getCredentials();

        /* Read data for contract */
        Uint256 id = new Uint256(new Random().nextInt(30000000));
        Address importer = new Address(deal.getInitiatorImporter() ? deal.getInitiatorWallet() : deal.getCounterPartyWallet());
        Address exporter = new Address(deal.getInitiatorImporter() ? deal.getCounterPartyWallet() : deal.getInitiatorWallet());
        Address importerBank = new Address(deal.getImporterBankWallet());
        Address exporterBank = new Address(deal.getExporterBankWallet());


        // payment info
        Uint256 dealPrice = new Uint256(deal.getDealPrice());
        Utf8String dealDate = new Utf8String(deal.getDealDate());
        Utf8String dealDesc = new Utf8String(deal.getDealDesc());


        LOGGER.info("Start deploying TF deal contract");
        /* Deploy smart contract */
        TfDealContract contract = TfDealContract.deploy(web3, credentials, GAS_PRICE, GAS_LIMIT, BigInteger.ZERO,
                id, importer, exporter, importerBank, exporterBank, dealDate, dealPrice, dealDesc).get();


        /* check contract compilation */
        Uint256 idOfDeployedContract = contract.getId().get();
        if (idOfDeployedContract == null)
            throw new UnsupportedOperationException("error of compilation TF deal smart contract");


        /* return contract address */
        return contract.getContractAddress();

    }

    /**
     * Deploy payment obligation smart contract in ethereum blockchain
     * <p>
     *
     * @param obligation
     * @return contract address
     */
    public String deployObligationSmartContract(PaymentObligation obligation) throws Exception {

        /* Connection to ethereum client */
        Web3j web3 = getEthereumConnection();
        /* Get credentials of main wallet */
        Credentials credentials = credentialsInfo.getCredentials();

        /* Read data for contract */
        Uint256 id = new Uint256(new Random().nextInt(30000000));

        Address dealAddress = new Address(obligation.getDealAddress());
        Bool payThroughContract = new Bool(obligation.getPayThroughContract());


        // payment info
        Uint256 obligationPrice = new Uint256(obligation.getObligationPrice());
        Utf8String startDate = new Utf8String(obligation.getStartDate());
        Utf8String endDate = new Utf8String(obligation.getEndDate());


        LOGGER.info("Start deploying payment obligation smart contract");
        /* Deploy smart contract */
        ObligationsContract contract = ObligationsContract.deploy(web3, credentials, GAS_PRICE, GAS_LIMIT, BigInteger.ZERO,
                id, dealAddress, payThroughContract, obligationPrice, startDate, endDate).get();


        /* check contract compilation */
        Uint256 idOfDeployedContract = contract.getId().get();
        if (idOfDeployedContract == null)
            throw new UnsupportedOperationException("error of compilation payment obligation smart contract");


        /* return contract address */
        return contract.getContractAddress();

    }

    /**
     * Deploy payment obligation smart contract in ethereum blockchain
     * <p>
     *
     * @param shipping
     * @return contract address
     */
    public String deployShippingSmartContract(Shipping shipping) throws Exception {

        /* Connection to ethereum client */
        Web3j web3 = getEthereumConnection();
        /* Get credentials of main wallet */
        Credentials credentials = credentialsInfo.getCredentials();

        /* Read data for contract */
        Uint256 id = new Uint256(new Random().nextInt(30000000));
        Address paymentAddress = new Address(shipping.getPaymentAddress());
        Address importerShipper = new Address(shipping.isPartyImporter()
                ? shipping.getPartyAddress()
                : shipping.getCounterPartyAddress());
        Address exporterShipper = new Address(shipping.isCounterPartyImporter()
                ? shipping.getPartyAddress()
                : shipping.getCounterPartyAddress());

        Utf8String startDate = new Utf8String(shipping.getStartDate());


        LOGGER.info("Start deploying shipping smart contract");
        /* Deploy smart contract */
        ShippingContract contract = ShippingContract.deploy(web3, credentials, GAS_PRICE, GAS_LIMIT, BigInteger.ZERO,
                id, paymentAddress,exporterShipper, importerShipper,startDate).get();


        /* check contract compilation */
        Uint256 idOfDeployedContract = contract.getId().get();
        if (idOfDeployedContract == null)
            throw new UnsupportedOperationException("error of compilation shipping smart contract");


        /* return contract address */
        return contract.getContractAddress();

    }


    private Web3j getEthereumConnection() {
        HttpService httpService = new HttpService(ethereumNodeAddress);
        return Web3j.build(httpService);
    }
}
