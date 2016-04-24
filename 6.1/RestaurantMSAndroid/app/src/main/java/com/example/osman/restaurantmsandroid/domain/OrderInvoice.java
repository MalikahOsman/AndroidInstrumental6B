package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-18.
 */
public class OrderInvoice implements Serializable{
    private Long id;
    private String invoiceDate;
    private double orderAmount;
    private String invoiceStatus;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public OrderInvoice(Builder builder)
    {
        this.id = builder.id;
        this.invoiceStatus = builder.invoiceDate;
        this.orderAmount = builder.orderAmount;
        this.invoiceStatus = builder.invoiceStatus;
    }

    public static class Builder {
        private Long id;
        private String invoiceDate;
        private double orderAmount;
        private String invoiceStatus;

        public Builder id(Long value) {
            this.id = value;
            return this;
        }

        public Builder invoiceDate(String value) {
            this.invoiceDate = value;
            return this;
        }

        public Builder orderAmount(double value) {
            this.orderAmount = value;
            return this;
        }

        public Builder invoiceStatus(String value) {
            this.invoiceStatus = value;
            return this;
        }

        public Builder copy(OrderInvoice value) {
            this.id = value.id;
            this.invoiceStatus = value.invoiceDate;
            this.orderAmount = value.orderAmount;
            this.invoiceStatus = value.invoiceStatus;

            return this;
        }

        public OrderInvoice build() {
            return new OrderInvoice(this);

        }
    }


}
