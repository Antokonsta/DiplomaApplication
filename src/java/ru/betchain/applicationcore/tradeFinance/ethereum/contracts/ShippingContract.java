package ru.betchain.applicationcore.tradeFinance.ethereum.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.3.0.
 */
public final class ShippingContract extends Contract {
    private static final String BINARY = "6060604052336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506000600660006101000a81548160ff0219169083151502179055506000600660016101000a81548160ff0219169083151502179055506000600660026101000a81548160ff02191690831515021790555034156100a057600080fd5b604051610b5c380380610b5c833981016040528080519060200190919080519060200190919080519060200190919080519060200190919080518201919050505b8460018190555083600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555082600360006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555081600460006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555080600590805190602001906101c19291906101cd565b505b5050505050610272565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061020e57805160ff191683800117855561023c565b8280016001018555821561023c579182015b8281111561023b578251825591602001919060010190610220565b5b509050610249919061024d565b5090565b61026f91905b8082111561026b576000816000905550600101610253565b5090565b90565b6108db806102816000396000f300606060405236156100c3576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680631269f45d146100c85780632645325b146100dd5780635bfc0a9b146100f25780635d1ca6311461010757806378f305c61461013057806397898dd9146101bf5780639d265e58146101ec578063b08014a414610241578063bb4b40c21461026e578063cbe39794146102c3578063e5d2b3f214610318578063ecf804df14610345578063ffa970361461035a575b600080fd5b34156100d357600080fd5b6100db610387565b005b34156100e857600080fd5b6100f0610404565b005b34156100fd57600080fd5b6101056104b4565b005b341561011257600080fd5b61011a610659565b6040518082815260200191505060405180910390f35b341561013b57600080fd5b610143610664565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101845780820151818401525b602081019050610168565b50505050905090810190601f1680156101b15780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156101ca57600080fd5b6101d261070d565b604051808215151515815260200191505060405180910390f35b34156101f757600080fd5b6101ff610725565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561024c57600080fd5b610254610750565b604051808215151515815260200191505060405180910390f35b341561027957600080fd5b610281610768565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156102ce57600080fd5b6102d6610793565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561032357600080fd5b61032b6107be565b604051808215151515815260200191505060405180910390f35b341561035057600080fd5b610358610806565b005b341561036557600080fd5b61036d610883565b604051808215151515815260200191505060405180910390f35b600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff168073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156103e457600080fd5b6001600660016101000a81548160ff0219169083151502179055505b5b50565b600061040e6107be565b156104b057600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff166394329b756040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401600060405180830381600087803b151561049b57600080fd5b6102c65a03f115156104ac57600080fd5b5050505b5b50565b600080600080600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1693508373ffffffffffffffffffffffffffffffffffffffff16636c90cd326000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561054b57600080fd5b6102c65a03f1151561055c57600080fd5b5050506040518051905092508291508173ffffffffffffffffffffffffffffffffffffffff1663a64e9fa66000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156105d757600080fd5b6102c65a03f115156105e857600080fd5b5050506040518051905090508073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561062e57600080fd5b6001600660026101000a81548160ff021916908315150217905550610651610404565b5b5b50505050565b600060015490505b90565b61066c61089b565b60058054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156107025780601f106106d757610100808354040283529160200191610702565b820191906000526020600020905b8154815290600101906020018083116106e557829003601f168201915b505050505090505b90565b6000600660009054906101000a900460ff1690505b90565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b6000600660019054906101000a900460ff1690505b90565b6000600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b6000600460009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b6000600660009054906101000a900460ff1680156107e85750600660019054906101000a900460ff165b80156108005750600660029054906101000a900460ff165b90505b90565b600460009054906101000a900473ffffffffffffffffffffffffffffffffffffffff168073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561086357600080fd5b6001600660006101000a81548160ff0219169083151502179055505b5b50565b6000600660029054906101000a900460ff1690505b90565b6020604051908101604052806000815250905600a165627a7a72305820a9babf19c50814b45b080c96bab5e3b2394091cd5fb8dd92f9f2bbb404c3837c0029";

    private ShippingContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private ShippingContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<TransactionReceipt> signExporterShipper() {
        Function function = new Function("signExporterShipper", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> triggerMoneyTransfer() {
        Function function = new Function("triggerMoneyTransfer", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> signImporter() {
        Function function = new Function("signImporter", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> getId() {
        Function function = new Function("getId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> getStartDate() {
        Function function = new Function("getStartDate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> importerShipperSigned() {
        Function function = new Function("importerShipperSigned", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> getPaymentAddress() {
        Function function = new Function("getPaymentAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> exporterShipperSigned() {
        Function function = new Function("exporterShipperSigned", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> getExporterShipper() {
        Function function = new Function("getExporterShipper", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> getImporterShipper() {
        Function function = new Function("getImporterShipper", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> isShippingContractReadyForMoneyTransfer() {
        Function function = new Function("isShippingContractReadyForMoneyTransfer", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> signImporterShipper() {
        Function function = new Function("signImporterShipper", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Bool> importerSigned() {
        Function function = new Function("importerSigned", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<ShippingContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Uint256 _id, Address _paymentAddress, Address _exporterShipper, Address _importerShipper, Utf8String _startDate) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_id, _paymentAddress, _exporterShipper, _importerShipper, _startDate));
        return deployAsync(ShippingContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Future<ShippingContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Uint256 _id, Address _paymentAddress, Address _exporterShipper, Address _importerShipper, Utf8String _startDate) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_id, _paymentAddress, _exporterShipper, _importerShipper, _startDate));
        return deployAsync(ShippingContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static ShippingContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ShippingContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static ShippingContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ShippingContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
