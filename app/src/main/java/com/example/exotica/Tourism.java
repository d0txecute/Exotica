package com.example.exotica;

import java.io.Serializable;

public class Tourism implements Serializable {
    private String activityName; // Name
    private String activityType; // Type
    private int activityDate; // Date
    private String activityImageName; // Image Name
    private double activityPrice; // Price
    private String activityDesc; // Description


    public Tourism(String activityName, String activityType, int activityDate, String activityImageName, double activityPrice, String activityDesc) {
        this.activityName = activityName;
        this.activityType = activityType;
        this.activityDate = activityDate;
        this.activityImageName = activityImageName;
        this.activityPrice = activityPrice;
        this.activityDesc = activityDesc;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getActivityType() {
        return activityType;
    }

    public int getActivityDate() {
        return activityDate;
    }

    public String getActivityImageName() {
        return activityImageName;
    }

    public double getActivityPrice() {
        return activityPrice;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setActivityDate(int activityDate) {
        this.activityDate = activityDate;
    }

    public void setActivityImageName(String activityImageName) {
        this.activityImageName = activityImageName;
    }

    public void setActivityPrice(double activityPrice) {
        this.activityPrice = activityPrice;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }
}