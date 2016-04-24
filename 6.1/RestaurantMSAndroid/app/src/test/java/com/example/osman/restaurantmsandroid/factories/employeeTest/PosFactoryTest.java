package com.example.osman.restaurantmsandroid.factories.employeeTest;

import com.example.osman.restaurantmsandroid.domain.POS_Cashier;
import com.example.osman.restaurantmsandroid.factories.PosFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Osman on 2016-04-19.
 */
public class PosFactoryTest {

    @Test
    public void testCreateCashier() throws Exception {
        POS_Cashier cashier = PosFactory.getPOS_Cashier("pc01", "0019");
        Assert.assertEquals("0019", cashier.getPassword());
    }

    @Test
    public void testUpdateCashier() throws Exception {
        POS_Cashier cashier = PosFactory.getPOS_Cashier("pc02", "0019");
        POS_Cashier newCashier = new POS_Cashier
                .Builder()
                .copy(cashier)
                .userName("pc02")
                .password("0019")
                .build();
        Assert.assertEquals("0019", newCashier.getPassword());

    }
}
