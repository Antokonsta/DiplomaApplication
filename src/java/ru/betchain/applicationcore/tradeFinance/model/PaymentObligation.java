package ru.betchain.applicationcore.tradeFinance.model;



public class PaymentObligation {
    private String dealAddress;
    private Boolean payThroughContract = true;
    private long dealPrice;
    private String dealDate;
    private String dealDesc;
    private String importerBankWallet;
    private String exporterBankWallet;
    private String counterPartyWallet;

    public String getDealAddress() {
        return dealAddress;
    }

    public void setDealAddress(String dealAddress) {
        this.dealAddress = dealAddress;
    }

    public Boolean getPayThroughContract() {
        return payThroughContract;
    }

    public void setPayThroughContract(Boolean payThroughContract) {
        this.payThroughContract = payThroughContract;
    }

    public long getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(long dealPrice) {
        this.dealPrice = dealPrice;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public String getDealDesc() {
        return dealDesc;
    }

    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }

    public String getImporterBankWallet() {
        return importerBankWallet;
    }

    public void setImporterBankWallet(String importerBankWallet) {
        this.importerBankWallet = importerBankWallet;
    }

    public String getExporterBankWallet() {
        return exporterBankWallet;
    }

    public void setExporterBankWallet(String exporterBankWallet) {
        this.exporterBankWallet = exporterBankWallet;
    }

    public String getCounterPartyWallet() {
        return counterPartyWallet;
    }

    public void setCounterPartyWallet(String counterPartyWallet) {
        this.counterPartyWallet = counterPartyWallet;
    }

    @Override
    public String toString() {
        return "PaymentObligation{" +
                "dealAddress='" + dealAddress + '\'' +
                ", payThroughContract=" + payThroughContract +
                ", dealPrice=" + dealPrice +
                ", dealDate='" + dealDate + '\'' +
                ", dealDesc='" + dealDesc + '\'' +
                ", importerBankWallet='" + importerBankWallet + '\'' +
                ", exporterBankWallet='" + exporterBankWallet + '\'' +
                ", counterPartyWallet='" + counterPartyWallet + '\'' +
                '}';
    }
}
