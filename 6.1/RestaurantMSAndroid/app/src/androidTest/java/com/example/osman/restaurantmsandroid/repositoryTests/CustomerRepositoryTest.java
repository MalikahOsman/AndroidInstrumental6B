package com.example.osman.restaurantmsandroid.repositoryTests;

import android.test.AndroidTestCase;

import com.example.osman.restaurantmsandroid.domain.Chef;
import com.example.osman.restaurantmsandroid.domain.Customer;
import com.example.osman.restaurantmsandroid.reposities.CustomerRepository;
import com.example.osman.restaurantmsandroid.reposities.Impl.CustomerRepositoryImpl;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by Osman on 2016-04-24.
 */
public class CustomerRepositoryTest extends AndroidTestCase {
    private static final String TAG = "CUSTOMER TEST";
    private Long id;

    public void testCreateReadUpdateDelete() throws Exception{
        CustomerRepository repo = new CustomerRepositoryImpl(this.getContext());
        //CREATE
        Customer createEntity = new Customer.Builder()
                .custNum("200")
                .custName("Mavis")
                .build();
        Customer insertedEntity = repo.save(createEntity);
        id = insertedEntity.getId();
        Assert.assertNotNull(TAG + " CREATE ", insertedEntity);

        //READ ALL
        Set<Customer> chef = repo.findAll();
        Assert.assertTrue(TAG + " READ ALL ", chef.size()>0);

        //READ ENTITY
        Customer entity = repo.findById(id);
        Assert.assertNotNull(TAG + " READ ENTITY ", entity);

        //UPDATE ENTITY
        Customer updateEntity = new Customer.Builder()
                .copy(entity)
                .build();
        repo.update(updateEntity);
        Customer newEntity = repo.findById(id);
        Assert.assertEquals(TAG + " UPDATE ENTITY", "21", newEntity.getCustNum());

        //DELETE ENTITY
        repo.delete(updateEntity);
        Customer deletedEntity = repo.findById(id);
        Assert.assertNull(TAG + " DELETE ", deletedEntity);

    }
}
