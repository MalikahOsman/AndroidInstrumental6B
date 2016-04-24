package com.example.osman.restaurantmsandroid.factories;

import com.example.osman.restaurantmsandroid.domain.Waiter;

/**
 * Created by Osman on 2016-04-19.
 */
public class WaiterFactory {
    public static Waiter getWaiter(Long id,String user, String pword, String empNum, String empName, String address, String telephone)
    {
        return new Waiter.Builder()
                .id(id)
                .userName(user)
                .password(pword)
                .empNum(empNum)
                .empName(empName)
                .address(address)
                .telephone(telephone)
                .build();
    }
}
