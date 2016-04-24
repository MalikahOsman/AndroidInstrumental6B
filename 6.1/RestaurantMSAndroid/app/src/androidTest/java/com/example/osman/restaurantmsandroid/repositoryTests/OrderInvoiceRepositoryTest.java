package com.example.osman.restaurantmsandroid.repositoryTests;

import android.test.AndroidTestCase;

import com.example.osman.restaurantmsandroid.domain.OrderInvoice;
import com.example.osman.restaurantmsandroid.reposities.Impl.OrderInvoiceRepositoryImpl;
import com.example.osman.restaurantmsandroid.reposities.OrderInvoiceRepository;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by Osman on 2016-04-24.
 */
public class OrderInvoiceRepositoryTest extends AndroidTestCase {
    public static final String TAG = "ORDER INVOICE TEST";
    private Long id;

    public void testCreateReadUpdateDelete() throws Exception{
        OrderInvoiceRepository repo = new OrderInvoiceRepositoryImpl(this.getContext());
        //CREATE
        OrderInvoice createEntity = new OrderInvoice.Builder()
                .invoiceDate("12/12/2012")
                .orderAmount(2000.00)
                .invoiceStatus("Paid")
                .build();
        OrderInvoice insertedEntity = repo.save(createEntity);
        id = insertedEntity.getId();
        Assert.assertNotNull(TAG + "CREATE", insertedEntity);

        //READ ALL
        Set<OrderInvoice> orderInvoice = repo.findAll();
        Assert.assertTrue(TAG + "READ ALL" , orderInvoice.size()>0);

        //READ ENTITY
        OrderInvoice entity = repo.findById(id);
        Assert.assertNotNull(TAG + "READ ENTITY", entity);

        //UPDATE ENTITY
        OrderInvoice updateEntity = new OrderInvoice.Builder()
                .copy(entity)
                .invoiceStatus("Not Paid")
                .build();
        repo.update(updateEntity);
        OrderInvoice newEntity = repo.findById(id);
        Assert.assertEquals(TAG + "UPDATE ENTITY", "Not Paid", newEntity.getInvoiceStatus());

        //DELETE ENTITY
        repo.delete(updateEntity);
        OrderInvoice deletedEntity = repo.findById(id);
        Assert.assertNull(TAG + "DELETE", deletedEntity);
    }


}
