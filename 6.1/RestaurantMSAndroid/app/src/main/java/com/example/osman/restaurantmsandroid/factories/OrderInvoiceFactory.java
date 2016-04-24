package com.example.osman.restaurantmsandroid.factories;

import com.example.osman.restaurantmsandroid.domain.OrderInvoice;

/**
 * Created by Osman on 2016-04-24.
 */
public class OrderInvoiceFactory {
    public static OrderInvoice getOrderInvoice(Long id, String invoiceDate, double orderAmount, String invoiceStatus ){
        return new OrderInvoice.Builder()
                .id(id)
                .invoiceDate(invoiceDate)
                .orderAmount(orderAmount)
                .invoiceStatus(invoiceStatus)
                .build();
    }
}
