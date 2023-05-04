package com.example.exotica;

import java.io.Serializable;

public class Tourism implements Serializable {
    private String activityName; // Name
    private String activityImageName; // Image Name
    private String activityLocation; //Location
    private int activityDate; // Date
    private double activityPrice; // Price
    private String activityDesc; // Description
    private double activityRating; // Rating
    private int activityContactPhone; // Phone Number
    private String activityContactEmail; // Email Address

    public Tourism(String activityName, String activityImageName, String activityLocation, int activityDate, double activityPrice, String activityDesc, double activityRating, int activityContactPhone, String activityContactEmail) {
        this.activityName = activityName;
        this.activityImageName = activityImageName;
        this.activityLocation = activityLocation;
        this.activityDate = activityDate;
        this.activityPrice = activityPrice;
        this.activityDesc = activityDesc;
        this.activityRating = activityRating;
        this.activityContactPhone = activityContactPhone;
        this.activityContactEmail = activityContactEmail;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getActivityImageName() {
        return activityImageName;
    }

    public String getActivityLocation() {return activityLocation; }

    public int getActivityDate() {
        return activityDate;
    }

    public double getActivityPrice() {
        return activityPrice;
    }

    public String getActivityDesc() { return activityDesc; }

    public double getActivityRating() {
        return activityRating;
    }

    public int getActivityContactPhone() {
        return activityContactPhone;
    }

    public String getActivityContactEmail() {
        return activityContactEmail;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setActivityImageName(String activityImageName) {
        this.activityImageName = activityImageName;
    }

    public void setActivityLocation(String activityLocation) {
        this.activityLocation = activityLocation;
    }

    public void setActivityDate(int activityDate) {
        this.activityDate = activityDate;
    }

    public void setActivityPrice(double activityPrice) {
        this.activityPrice = activityPrice;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public void setActivityRating(double activityRating) {
        this.activityRating = activityRating;
    }

    public void setActivityContactPhone(int activityContactPhone) {
        this.activityContactPhone = activityContactPhone;
    }

    public void setActivityContactEmail(String activityContactEmail) {
        this.activityContactEmail = activityContactEmail;
    }
}