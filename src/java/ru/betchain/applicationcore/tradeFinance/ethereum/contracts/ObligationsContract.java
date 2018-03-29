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
    private static final String BINARY = "6060604052336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506000600660006101000a81548160ff021916908315150217905550341561006a57600080fd5b604051610c6e380380610c6e833981016040528080519060200190919080519060200190919080519060200190919080519060200190919080518201919060200180518201919050505b8560018190555084600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555083600260146101000a81548160ff021916908315150217905550826003819055508160049080519060200190610133929190610157565b50806005908051906020019061014a929190610157565b505b5050505050506101fc565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061019857805160ff19168380011785556101c6565b828001600101855582156101c6579182015b828111156101c55782518255916020019190600101906101aa565b5b5090506101d391906101d7565b5090565b6101f991905b808211156101f55760008160009055506001016101dd565b5090565b90565b610a638061020b6000396000f300606060405236156100ad576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806312065fe0146100b257806338ee499f146100db5780635d1ca631146101085780636c90cd3214610131578063708c06cc1461018657806378f305c6146101b3578063826932bf1461024257806394329b751461026f578063b135648814610284578063eb7c125114610313578063f155eebd14610328575b600080fd5b34156100bd57600080fd5b6100c5610351565b6040518082815260200191505060405180910390f35b34156100e657600080fd5b6100ee610371565b604051808215151515815260200191505060405180910390f35b341561011357600080fd5b61011b610389565b6040518082815260200191505060405180910390f35b341561013c57600080fd5b610144610394565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561019157600080fd5b6101996103bf565b604051808215151515815260200191505060405180910390f35b34156101be57600080fd5b6101c66103d7565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156102075780820151818401525b6020810190506101eb565b50505050905090810190601f1680156102345780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561024d57600080fd5b610255610480565b604051808215151515815260200191505060405180910390f35b341561027a57600080fd5b610282610730565b005b341561028f57600080fd5b610297610863565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156102d85780820151818401525b6020810190506102bc565b50505050905090810190601f1680156103055780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561031e57600080fd5b61032661090c565b005b341561033357600080fd5b61033b610a18565b6040518082815260200191505060405180910390f35b60003073ffffffffffffffffffffffffffffffffffffffff163190505b90565b6000600260149054906101000a900460ff1690505b90565b600060015490505b90565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b6000600660009054906101000a900460ff1690505b90565b6103df610a23565b60048054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156104755780601f1061044a57610100808354040283529160200191610475565b820191906000526020600020905b81548152906001019060200180831161045857829003601f168201915b505050505090505b90565b600080600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff1663ffa970366000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561051457600080fd5b6102c65a03f1151561052557600080fd5b5050506040518051905080156105be57508073ffffffffffffffffffffffffffffffffffffffff1663708c06cc6000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156105a257600080fd5b6102c65a03f115156105b357600080fd5b505050604051805190505b801561064d57508073ffffffffffffffffffffffffffffffffffffffff16635e4822c46000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561063157600080fd5b6102c65a03f1151561064257600080fd5b505050604051805190505b80156106dc57508073ffffffffffffffffffffffffffffffffffffffff1663f5d553356000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156106c057600080fd5b6102c65a03f115156106d157600080fd5b505050604051805190505b80156106ec57506106eb6103bf565b5b80156107295750600260149054906101000a900460ff16158061072857506003543073ffffffffffffffffffffffffffffffffffffffff163110155b5b91505b5090565b60008061073b610480565b80156107535750600260149054906101000a900460ff165b1561085e57600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1691508173ffffffffffffffffffffffffffffffffffffffff16630cb747d06000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156107e957600080fd5b6102c65a03f115156107fa57600080fd5b5050506040518051905090508073ffffffffffffffffffffffffffffffffffffffff166108fc3073ffffffffffffffffffffffffffffffffffffffff16319081150290604051600060405180830381858888f19350505050151561085d57600080fd5b5b5b5050565b61086b610a23565b60058054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156109015780601f106108d657610100808354040283529160200191610901565b820191906000526020600020905b8154815290600101906020018083116108e457829003601f168201915b505050505090505b90565b600080600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1691508173ffffffffffffffffffffffffffffffffffffffff1663194a044f6000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156109a057600080fd5b6102c65a03f115156109b157600080fd5b5050506040518051905090508073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156109f757600080fd5b6001600660006101000a81548160ff0219169083151502179055505b5b5050565b600060035490505b90565b6020604051908101604052806000815250905600a165627a7a72305820b51429ecf2ce5fd66073cdbd12d61672a66ec25339f75bb1527d41ffe6c95ec70029";

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
