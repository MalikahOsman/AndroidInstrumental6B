package com.example.osman.restaurantmsandroid.factories.employeeTest;

import com.example.osman.restaurantmsandroid.domain.RestaurantManager;
import com.example.osman.restaurantmsandroid.factories.ManagerFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Osman on 2016-04-19.
 */
public class ManagerRepositoryTest {
    @Test
    public void testCreateManager() throws Exception {
        RestaurantManager manager = ManagerFactory.getManagerFactory("rm01", "0020");
        Assert.assertEquals("0020", manager.getPassword());
    }

    @Test
    public void testUpdateManager() throws Exception {
        RestaurantManager waiter = ManagerFactory.getManagerFactory("rm03", "0021");
        RestaurantManager newWaiter = new RestaurantManager
                .Builder()
                .copy(waiter)
                .userName("rm03")
                .password("0021")
                .build();
        Assert.assertEquals("0021", newWaiter.getPassword());

    }
}
