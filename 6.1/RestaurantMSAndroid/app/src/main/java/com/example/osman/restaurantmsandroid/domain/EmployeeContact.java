package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Osman on 2016-04-19.
 */
public class EmployeeContact implements Serializable{
    private Long id;
    private String contactTypeId;
    private String contactValue;
    private String status;
    private String date;

    private EmployeeContact(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(String contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public EmployeeContact(Builder builder)
    {
        this.id = builder.id;
        this.contactTypeId= builder.contactTypeId;
        this.contactValue = builder.contactValue;
        this.date = builder.date;

        this.status = builder.status;

    }

    public static class Builder{
        private Long id;
        private String contactTypeId;
        private String contactValue;
        private String status;
        private String date;


        public Builder id(Long value){
            this.id =value;
            return this;
        }

        public Builder date(String value){
            this.date =value;
            return this;
        }

        public Builder contactTypeId(String value){
            this.contactTypeId =value;
            return this;
        }

        public Builder contactValue(String value){
            this.contactValue =value;
            return this;
        }

        public Builder status(String value){
            this.status =value;
            return this;
        }


        public Builder copy(EmployeeContact value){
            this.id = value.id;
            this.contactTypeId= value.contactTypeId;
            this.contactValue=value.contactValue;
            this.date=value.date;
            this.status=value.status;
            return  this;
        }

        public EmployeeContact build(){
            return new EmployeeContact(this);
        }
    }



}
