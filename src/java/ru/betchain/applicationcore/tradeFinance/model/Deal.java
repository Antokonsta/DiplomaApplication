package ru.betchain.applicationcore.tradeFinance.model;

public class Deal {
    private String userInitiator;
    private String selected;
    private long dealPrice;

    public String getUserInitiator() {
        return userInitiator;
    }

    public void setUserInitiator(String userInitiator) {
        this.userInitiator = userInitiator;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public long getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(long dealPrice) {
        this.dealPrice = dealPrice;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "userInitiator='" + userInitiator + '\'' +
                ", selected='" + selected + '\'' +
                ", dealPrice=" + dealPrice +
                '}';
    }
}
