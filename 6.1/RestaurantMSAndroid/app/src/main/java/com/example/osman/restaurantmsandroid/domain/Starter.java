package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-18.
 */
public class Starter extends Menu implements Serializable {
    private Long id;
    String starterID;
    String foodItem;

    public Starter() {
    }

    public Starter(String starterID, String foodItem) {
        this.starterID = starterID;
        this.foodItem = foodItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStarterID() {
        return starterID;
    }

    public void setStarterID(String starterID) {
        this.starterID = starterID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Starter{" +
                "starterID='" + starterID + '\'' +
                ", foodItem='" + foodItem + '\'' +
                '}';
    }
}
