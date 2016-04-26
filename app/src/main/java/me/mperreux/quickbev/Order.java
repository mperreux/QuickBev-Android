package me.mperreux.quickbev;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Michael on 4/5/2016.
 */
public class Order {
    private int amount;
    private boolean processed;
    private String createdTime;

    public Order(int amount, boolean processed){
        this.amount = amount;
        this.processed = processed;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.createdTime = dateFormat.format(new Date()); // Find todays date
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
}
