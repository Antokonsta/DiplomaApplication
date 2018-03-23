package ru.betchain.applicationcore.tradeFinance.ethereum;


import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import ru.betchain.applicationcore.tradeFinance.model.Deal;


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
     * Deploy smart contract in ethereum blockchain
     * <p>
     *
     * @param deal
     * @return contract address
     */
    public String deploySmartContract(Deal deal) throws Exception {

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
            throw new UnsupportedOperationException("error of compilation flight smart contract");


        /* return contract address */
        return contract.getContractAddress();

    }


    private Web3j getEthereumConnection() {
        HttpService httpService = new HttpService(ethereumNodeAddress);
        return Web3j.build(httpService);
    }
}