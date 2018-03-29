package ru.betchain.applicationcore.tradeFinance.model;



public class Shipping {
    private String paymentAddress;
    private Boolean payThroughContract = true;
    private long obligationPrice;
    private String startDate;
    private String endDate;

    public String getPaymentAddress() {
        return paymentAddress;
    }

    public void setPaymentAddress(String paymentAddress) {
        this.paymentAddress = paymentAddress;
    }

    public Boolean getPayThroughContract() {
        return payThroughContract;
    }

    public void setPayThroughContract(Boolean payThroughContract) {
        this.payThroughContract = payThroughContract;
    }

    public long getObligationPrice() {
        return obligationPrice;
    }

    public void setObligationPrice(long obligationPrice) {
        this.obligationPrice = obligationPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


}
