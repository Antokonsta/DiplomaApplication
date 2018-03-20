package ru.betchain.applicationcore.tradeFinance.model;



public class Deal {
    private String initiatorWallet;
    private Boolean initiatorImporter;
    private long dealPrice;
    private String dealDate;
    private String dealDesc;
    private String importerBankWallet;
    private String exporterBankWallet;
    private String counterPartyWallet;

    public String getInitiatorWallet() {
        return initiatorWallet;
    }

    public void setInitiatorWallet(String initiatorWallet) {
        this.initiatorWallet = initiatorWallet;
    }

    public Boolean getInitiatorImporter() {
        return initiatorImporter;
    }

    public void setInitiatorImporter(Boolean initiatorImporter) {
        this.initiatorImporter = initiatorImporter;
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
        return "Deal{" +
                "initiatorWallet='" + initiatorWallet + '\'' +
                ", initiatorImporter=" + initiatorImporter +
                ", dealPrice=" + dealPrice +
                ", dealDate='" + dealDate + '\'' +
                ", dealDesc='" + dealDesc + '\'' +
                ", importerBankWallet='" + importerBankWallet + '\'' +
                ", exporterBankWallet='" + exporterBankWallet + '\'' +
                ", counterPartyWallet='" + counterPartyWallet + '\'' +
                '}';
    }
}
