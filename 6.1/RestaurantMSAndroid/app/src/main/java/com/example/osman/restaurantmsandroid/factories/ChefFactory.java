package com.example.osman.restaurantmsandroid.factories;

import com.example.osman.restaurantmsandroid.domain.Chef;

/**
 * Created by Osman on 2016-04-19.
 */
public class ChefFactory {
    public static Chef getChefFactory(Long id, String uname, String pword, String ename, String empNum, String empAdd, String empTel){
        return new Chef.Builder()
                .id(id)
                .userName(uname)
                .password(pword)
                .empName(ename)
                .empNum(empNum)
                .address(empAdd)
                .telephone(empTel)
                .build();

    }
}
