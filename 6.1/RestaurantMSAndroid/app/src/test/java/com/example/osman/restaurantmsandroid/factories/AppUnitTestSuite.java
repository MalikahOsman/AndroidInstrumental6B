package com.example.osman.restaurantmsandroid.factories;

import com.example.osman.restaurantmsandroid.factories.employeeTest.ChefFactoryTest;
import com.example.osman.restaurantmsandroid.factories.employeeTest.EmployeeAddressTypeTest;
import com.example.osman.restaurantmsandroid.factories.employeeTest.ManagerRepositoryTest;
import com.example.osman.restaurantmsandroid.factories.employeeTest.PosFactoryTest;
import com.example.osman.restaurantmsandroid.factories.employeeTest.WaiterFactoryTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Osman on 2016-04-19.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EmployeeAddressTypeTest.class,
        ChefFactoryTest.class,
        ManagerRepositoryTest.class,
        PosFactoryTest.class,
        WaiterFactoryTest.class})
public class AppUnitTestSuite {

}
