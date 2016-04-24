package com.example.osman.restaurantmsandroid.factories;

import com.example.osman.restaurantmsandroid.domain.EmployeeAddress;

import java.util.Date;

/**
 * Created by Osman on 2016-04-18.
 */
public class AddressFactory {
    public static EmployeeAddress getAddress(String address, String postalcode, String date)
    {
        return new EmployeeAddress.Builder()
                .addressTypeId(address)
                .postalCode(postalcode)
                .date(date)
                .build();

    }
}
