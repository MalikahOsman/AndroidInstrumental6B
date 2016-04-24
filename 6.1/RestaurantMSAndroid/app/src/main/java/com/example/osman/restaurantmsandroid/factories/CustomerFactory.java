package com.example.osman.restaurantmsandroid.factories;

import com.example.osman.restaurantmsandroid.domain.Customer;

/**
 * Created by Osman on 2016-04-24.
 */
public class CustomerFactory {
    public static Customer getCustomerFactory(Long id, String custName, String custNum) {
        return new Customer.Builder()
                .id(id)
                .custName(custName)
                .custNum(custNum)
                .build();

    }
}
