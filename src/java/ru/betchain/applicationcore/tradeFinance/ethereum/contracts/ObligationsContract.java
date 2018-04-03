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
public final class ObligationsContract extends Contract {
    private static final String BINARY = "6060604052336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506000600660006101000a81548160ff021916908315150217905550341561006a57600080fd5b604051610c6d380380610c6d833981016040528080519060200190919080519060200190919080519060200190919080519060200190919080518201919060200180518201919050505b8560018190555084600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555083600260146101000a81548160ff021916908315150217905550826003819055508160049080519060200190610133929190610157565b50806005908051906020019061014a929190610157565b505b5050505050506101fc565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061019857805160ff19168380011785556101c6565b828001600101855582156101c6579182015b828111156101c55782518255916020019190600101906101aa565b5b5090506101d391906101d7565b5090565b6101f991905b808211156101f55760008160009055506001016101dd565b5090565b90565b610a628061020b6000396000f300606060405236156100ad576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806312065fe0146100b157806338ee499f146100da5780635d1ca631146101075780636c90cd3214610130578063708c06cc1461018557806378f305c6146101b2578063826932bf1461024157806394329b751461026e578063b135648814610283578063eb7c125114610312578063f155eebd14610327575b5b5b005b34156100bc57600080fd5b6100c4610350565b6040518082815260200191505060405180910390f35b34156100e557600080fd5b6100ed610370565b604051808215151515815260200191505060405180910390f35b341561011257600080fd5b61011a610388565b6040518082815260200191505060405180910390f35b341561013b57600080fd5b610143610393565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561019057600080fd5b6101986103be565b604051808215151515815260200191505060405180910390f35b34156101bd57600080fd5b6101c56103d6565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156102065780820151818401525b6020810190506101ea565b50505050905090810190601f1680156102335780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561024c57600080fd5b61025461047f565b604051808215151515815260200191505060405180910390f35b341561027957600080fd5b61028161072f565b005b341561028e57600080fd5b610296610862565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156102d75780820151818401525b6020810190506102bb565b50505050905090810190601f1680156103045780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561031d57600080fd5b61032561090b565b005b341561033257600080fd5b61033a610a17565b6040518082815260200191505060405180910390f35b60003073ffffffffffffffffffffffffffffffffffffffff163190505b90565b6000600260149054906101000a900460ff1690505b90565b600060015490505b90565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b6000600660009054906101000a900460ff1690505b90565b6103de610a22565b60048054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156104745780601f1061044957610100808354040283529160200191610474565b820191906000526020600020905b81548152906001019060200180831161045757829003601f168201915b505050505090505b90565b600080600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff1663ffa970366000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561051357600080fd5b6102c65a03f1151561052457600080fd5b5050506040518051905080156105bd57508073ffffffffffffffffffffffffffffffffffffffff1663708c06cc6000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156105a157600080fd5b6102c65a03f115156105b257600080fd5b505050604051805190505b801561064c57508073ffffffffffffffffffffffffffffffffffffffff16635e4822c46000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561063057600080fd5b6102c65a03f1151561064157600080fd5b505050604051805190505b80156106db57508073ffffffffffffffffffffffffffffffffffffffff1663f5d553356000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156106bf57600080fd5b6102c65a03f115156106d057600080fd5b505050604051805190505b80156106eb57506106ea6103be565b5b80156107285750600260149054906101000a900460ff16158061072757506003543073ffffffffffffffffffffffffffffffffffffffff163110155b5b91505b5090565b60008061073a61047f565b80156107525750600260149054906101000a900460ff165b1561085d57600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1691508173ffffffffffffffffffffffffffffffffffffffff16630cb747d06000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156107e857600080fd5b6102c65a03f115156107f957600080fd5b5050506040518051905090508073ffffffffffffffffffffffffffffffffffffffff166108fc3073ffffffffffffffffffffffffffffffffffffffff16319081150290604051600060405180830381858888f19350505050151561085c57600080fd5b5b5b5050565b61086a610a22565b60058054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156109005780601f106108d557610100808354040283529160200191610900565b820191906000526020600020905b8154815290600101906020018083116108e357829003601f168201915b505050505090505b90565b600080600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1691508173ffffffffffffffffffffffffffffffffffffffff1663194a044f6000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561099f57600080fd5b6102c65a03f115156109b057600080fd5b5050506040518051905090508073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156109f657600080fd5b6001600660006101000a81548160ff0219169083151502179055505b5b5050565b600060035490505b90565b6020604051908101604052806000815250905600a165627a7a7230582072af06b4b61e599cab3bb9876e024a647c6d118f9b023397b454dab4475947020029";

    private ObligationsContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private ObligationsContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Uint256> getBalance() {
        Function function = new Function("getBalance", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> isPayThroughContract() {
        Function function = new Function("isPayThroughContract", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> getId() {
        Function function = new Function("getId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> getDealAddress() {
        Function function = new Function("getDealAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> exporterSigned() {
        Function function = new Function("exporterSigned", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> getStartDate() {
        Function function = new Function("getStartDate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Bool> isReadyForPaymentTransfer() {
        Function function = new Function("isReadyForPaymentTransfer", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> transferPayment() {
        Function function = new Function("transferPayment", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Utf8String> getEndDate() {
        Function function = new Function("getEndDate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> signExporter() {
        Function function = new Function("signExporter", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> getObligationPrice() {
        Function function = new Function("getObligationPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<ObligationsContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Uint256 _id, Address _dealAddress, Bool _payThroughContract, Uint256 _obligationPrice, Utf8String _startDate, Utf8String _endDate) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_id, _dealAddress, _payThroughContract, _obligationPrice, _startDate, _endDate));
        return deployAsync(ObligationsContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Future<ObligationsContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Uint256 _id, Address _dealAddress, Bool _payThroughContract, Uint256 _obligationPrice, Utf8String _startDate, Utf8String _endDate) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_id, _dealAddress, _payThroughContract, _obligationPrice, _startDate, _endDate));
        return deployAsync(ObligationsContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static ObligationsContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ObligationsContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static ObligationsContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ObligationsContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
