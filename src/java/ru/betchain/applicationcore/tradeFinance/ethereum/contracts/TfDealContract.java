package ru.betchain.applicationcore.tradeFinance.ethereum.contracts;

import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.*;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.3.0.
 */
public final class TfDealContract extends Contract {
    private static final String BINARY = "6060604052336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506000600960006101000a81548160ff0219169083151502179055506000600960016101000a81548160ff0219169083151502179055506000600960026101000a81548160ff0219169083151502179055506000600960036101000a81548160ff02191690831515021790555034156100bb57600080fd5b604051610c76380380610c76833981016040528080519060200190919080519060200190919080519060200190919080519060200190919080519060200190919080518201919060200180519060200190919080518201919050505b8760018190555086600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555085600360006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555084600460006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555083600560006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055508260069080519060200190610238929190610265565b50816007819055508060089080519060200190610256929190610265565b505b505050505050505061030a565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106102a657805160ff19168380011785556102d4565b828001600101855582156102d4579182015b828111156102d35782518255916020019190600101906102b8565b5b5090506102e191906102e5565b5090565b61030791905b808211156103035760008160009055506001016102eb565b5090565b90565b61095d806103196000396000f300606060405236156100e4576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680630cb747d0146100e9578063194a044f1461013e5780634276554c146101935780635bfc0a9b146101a85780635d1ca631146101bd5780635e4822c4146101e657806365f0ef83146102135780636c89f0b214610268578063708c06cc146102915780638a9abf4b146102be578063a64e9fa6146102d3578063b528d00e14610328578063c69e0aaa146103b7578063eb7c125114610446578063f5d553351461045b578063ffa9703614610488575b600080fd5b34156100f457600080fd5b6100fc6104b5565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561014957600080fd5b6101516104e0565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561019e57600080fd5b6101a661050b565b005b34156101b357600080fd5b6101bb610588565b005b34156101c857600080fd5b6101d0610605565b6040518082815260200191505060405180910390f35b34156101f157600080fd5b6101f9610610565b604051808215151515815260200191505060405180910390f35b341561021e57600080fd5b610226610628565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561027357600080fd5b61027b610653565b6040518082815260200191505060405180910390f35b341561029c57600080fd5b6102a461065e565b604051808215151515815260200191505060405180910390f35b34156102c957600080fd5b6102d1610676565b005b34156102de57600080fd5b6102e66106f3565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561033357600080fd5b61033b61071e565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561037c5780820151818401525b602081019050610360565b50505050905090810190601f1680156103a95780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156103c257600080fd5b6103ca6107c7565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561040b5780820151818401525b6020810190506103ef565b50505050905090810190601f1680156104385780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561045157600080fd5b610459610870565b005b341561046657600080fd5b61046e6108ed565b604051808215151515815260200191505060405180910390f35b341561049357600080fd5b61049b610905565b604051808215151515815260200191505060405180910390f35b6000600560009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b6000600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b600560009054906101000a900473ffffffffffffffffffffffffffffffffffffffff168073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561056857600080fd5b6001600960036101000a81548160ff0219169083151502179055505b5b50565b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff168073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156105e557600080fd5b6001600960006101000a81548160ff0219169083151502179055505b5b50565b600060015490505b90565b6000600960029054906101000a900460ff1690505b90565b6000600460009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b600060075490505b90565b6000600960019054906101000a900460ff1690505b90565b600460009054906101000a900473ffffffffffffffffffffffffffffffffffffffff168073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156106d357600080fd5b6001600960026101000a81548160ff0219169083151502179055505b5b50565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b61072661091d565b60068054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156107bc5780601f10610791576101008083540402835291602001916107bc565b820191906000526020600020905b81548152906001019060200180831161079f57829003601f168201915b505050505090505b90565b6107cf61091d565b60088054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156108655780601f1061083a57610100808354040283529160200191610865565b820191906000526020600020905b81548152906001019060200180831161084857829003601f168201915b505050505090505b90565b600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff168073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156108cd57600080fd5b6001600960016101000a81548160ff0219169083151502179055505b5b50565b6000600960039054906101000a900460ff1690505b90565b6000600960009054906101000a900460ff1690505b90565b6020604051908101604052806000815250905600a165627a7a72305820ba4ddc0ab2db34c91d42334186435587216dedca603d402ddc7278230d5e5bc60029";

    private TfDealContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private TfDealContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Address> getExporterBank() {
        Function function = new Function("getExporterBank", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> getExporter() {
        Function function = new Function("getExporter", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> signExporterBank() {
        Function function = new Function("signExporterBank", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
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

    public Future<Bool> importerBankSigned() {
        Function function = new Function("importerBankSigned", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> getImporterBank() {
        Function function = new Function("getImporterBank", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> getDealPrice() {
        Function function = new Function("getDealPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> exporterSigned() {
        Function function = new Function("exporterSigned", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> signImporterBank() {
        Function function = new Function("signImporterBank", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Address> getImporter() {
        Function function = new Function("getImporter", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> getDealDate() {
        Function function = new Function("getDealDate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> getDealDesc() {
        Function function = new Function("getDealDesc", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> signExporter() {
        Function function = new Function("signExporter", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Bool> exporterBankSigned() {
        Function function = new Function("exporterBankSigned", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> importerSigned() {
        Function function = new Function("importerSigned", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<TfDealContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Uint256 _id, Address _importer, Address _exporter, Address _importerBank, Address _exporterBank, Utf8String _dealDate, Uint256 _dealPrice, Utf8String _dealDesc) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_id, _importer, _exporter, _importerBank, _exporterBank, _dealDate, _dealPrice, _dealDesc));
        return deployAsync(TfDealContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Future<TfDealContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Uint256 _id, Address _importer, Address _exporter, Address _importerBank, Address _exporterBank, Utf8String _dealDate, Uint256 _dealPrice, Utf8String _dealDesc) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_id, _importer, _exporter, _importerBank, _exporterBank, _dealDate, _dealPrice, _dealDesc));
        return deployAsync(TfDealContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static TfDealContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TfDealContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static TfDealContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TfDealContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
