package me.mperreux.quickbev;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Michael on 4/5/2016.
 */
public class Order {
    private int ounces;

    private double milliliters;

    private String createdTime;

    private boolean processed;

    public Order(int amount, boolean processed){
        this.ounces = amount;
        this.milliliters = amount * 29.574;
        this.processed = processed;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.createdTime = dateFormat.format(new Date()); // Find todays date
    }

    public double getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }

    public int getOunces() {
        return ounces;
    }
    public void setOunces(int ounces) {
        this.ounces = ounces;
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
