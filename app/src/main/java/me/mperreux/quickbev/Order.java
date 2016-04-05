package me.mperreux.quickbev;

/**
 * Created by Michael on 4/5/2016.
 */
public class Order {
    int amount;
    boolean processed;

    public Order(int amount, boolean processed){
        this.amount = amount;
        this.processed = processed;
    }
}
