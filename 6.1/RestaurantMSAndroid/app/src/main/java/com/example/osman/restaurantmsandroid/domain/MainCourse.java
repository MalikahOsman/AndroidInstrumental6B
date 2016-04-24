package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-24.
 */
public class MainCourse extends Menu implements Serializable {
    private Long id;
    String mainID;
    String foodItem;

    public MainCourse() {
    }

    public MainCourse(String mainID, String foodItem) {
        this.mainID = mainID;
        this.foodItem = foodItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainID() {
        return mainID;
    }

    public void setMainID(String mainID) {
        this.mainID = mainID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "MainCourse{" +
                "foodItem='" + foodItem + '\'' +
                ", mainID='" + mainID + '\'' +
                '}';
    }
}

