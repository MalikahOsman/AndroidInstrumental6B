package com.example.osman.restaurantmsandroid.factories.employeeTest;

import com.example.osman.restaurantmsandroid.domain.Chef;
import com.example.osman.restaurantmsandroid.factories.ChefFactory;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Osman on 2016-04-19.
 */
public class ChefFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Chef chef = ChefFactory.getChefFactory("ch01", "0016");
        Assert.assertEquals("0016", chef.getPassword());

    }

    @Test
    public void testUpdate() throws Exception {
        Chef chef = ChefFactory.getChefFactory("ch02", "0017");
        Chef newChef = new Chef
                .Builder()
                .copy(chef)
                .userName("ch02")
                .password("0017")
                .build();
        Assert.assertEquals("0017", newChef.getPassword());
    }
}
