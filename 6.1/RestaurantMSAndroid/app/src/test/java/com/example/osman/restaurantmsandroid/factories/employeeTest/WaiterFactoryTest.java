package com.example.osman.restaurantmsandroid.factories.employeeTest;

import com.example.osman.restaurantmsandroid.domain.Waiter;
import com.example.osman.restaurantmsandroid.factories.WaiterFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Osman on 2016-04-19.
 */
public class WaiterFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Waiter waiter = WaiterFactory.getWaiter("wa02", "0017");
        Assert.assertEquals("0017", waiter.getPassword());
    }

    @Test
    public void testUpdate() throws Exception {
        Waiter waiter = WaiterFactory.getWaiter("wa03", "0018");
        Waiter newWaiter = new Waiter
                .Builder()
                .copy(waiter)
                .userName("wa03")
                .password("0018")
                .build();
        Assert.assertEquals("0018", newWaiter.getPassword());

    }
}
