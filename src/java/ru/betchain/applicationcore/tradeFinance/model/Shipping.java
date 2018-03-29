package ru.betchain.applicationcore.tradeFinance.model;



public class Shipping {
    private String paymentAddress;
    private String startDate;
    private boolean partyImporter;
    private boolean counterPartyImporter;
    private String partyAddress;
    private String counterPartyAddress;

    public String getPaymentAddress() {
        return paymentAddress;
    }

    public void setPaymentAddress(String paymentAddress) {
        this.paymentAddress = paymentAddress;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public boolean isPartyImporter() {
        return partyImporter;
    }

    public void setPartyImporter(boolean partyImporter) {
        this.partyImporter = partyImporter;
    }

    public String getPartyAddress() {
        return partyAddress;
    }

    public void setPartyAddress(String partyAddress) {
        this.partyAddress = partyAddress;
    }

    public String getCounterPartyAddress() {
        return counterPartyAddress;
    }

    public void setCounterPartyAddress(String counterPartyAddress) {
        this.counterPartyAddress = counterPartyAddress;
    }

    public boolean isCounterPartyImporter() {
        return counterPartyImporter;
    }

    public void setCounterPartyImporter(boolean counterPartyImporter) {
        this.counterPartyImporter = counterPartyImporter;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "paymentAddress='" + paymentAddress + '\'' +
                ", startDate='" + startDate + '\'' +
                ", partyImporter=" + partyImporter +
                ", counterPartyImporter=" + counterPartyImporter +
                ", partyAddress='" + partyAddress + '\'' +
                ", counterPartyAddress='" + counterPartyAddress + '\'' +
                '}';
    }
}
