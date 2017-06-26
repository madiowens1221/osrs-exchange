package com.osrs.item;

/**
 * Created by Jeremy on 6/25/17.
 */
public class Item {
    private int overall;
    private int buying;
    private int buyingQuanity;
    private int selling;
    private int sellingQuantity;

    public Item(){
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getBuying() {
        return buying;
    }

    public void setBuying(int buying) {
        this.buying = buying;
    }

    public int getBuyingQuanity() {
        return buyingQuanity;
    }

    public void setBuyingQuanity(int buyingQuanity) {
        this.buyingQuanity = buyingQuanity;
    }

    public int getSelling() {
        return selling;
    }

    public void setSelling(int selling) {
        this.selling = selling;
    }

    public int getSellingQuantity() {
        return sellingQuantity;
    }

    public void setSellingQuantity(int sellingQuantity) {
        this.sellingQuantity = sellingQuantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "overall=" + overall +
                ", buying=" + buying +
                ", buyingQuanity=" + buyingQuanity +
                ", selling=" + selling +
                ", sellingQuantity=" + sellingQuantity +
                '}';
    }
}
