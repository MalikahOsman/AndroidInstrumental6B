package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-18.
 */
public class Dessert extends Menu implements Serializable {
    private Long id;
    String dessertID;
    String foodItem;

    public Dessert() {
    }

    public Dessert(String dessertID, String foodItem) {
        this.dessertID = dessertID;
        this.foodItem = foodItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDessertID() {
        return dessertID;
    }

    public void setDessertID(String dessertID) {
        this.dessertID = dessertID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "dessertID='" + dessertID + '\'' +
                ", foodItem='" + foodItem + '\'' +
                '}';
    }

}
