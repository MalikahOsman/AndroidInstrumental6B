package com.example.osman.restaurantmsandroid.factories;

import com.example.osman.restaurantmsandroid.domain.RestaurantManager;

/**
 * Created by Osman on 2016-04-19.
 */
public class ManagerFactory {
    public static RestaurantManager getManagerFactory(Long id, String userName, String pword, String empNum, String empName, String address, String telephone) {
        return new RestaurantManager.Builder()
                    .id(id)
                    .userName(userName)
                    .password(pword)
                    .empNum(empNum)
                    .empName(empName)
                    .address(address)
                    .telephone(telephone)
                    .build();

    }
}
