package ru.betchain.applicationcore.tradeFinance.model.etherscan;

import java.util.List;

public class EtherscanContractResponse {
    private String message;
    private String status;
    private List<EtherscanContractResultResponse> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<EtherscanContractResultResponse> getResult() {
        return result;
    }

    public void setResult(List<EtherscanContractResultResponse> result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EtherscanContractResponse{" +
                "message='" + message + '\'' +
                ", result=" + result.toString() +
                '}';
    }
}
