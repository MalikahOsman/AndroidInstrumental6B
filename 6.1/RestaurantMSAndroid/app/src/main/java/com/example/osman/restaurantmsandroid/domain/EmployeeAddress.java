package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by Osman on 2016-04-18.
 */
public class EmployeeAddress implements Serializable{
    private Long id;
    private String description;
    private String postalCode;
    private String addressTypeId;
    private String date;
    //private String state;

    public EmployeeAddress() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(String addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /*/public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }*/

    public EmployeeAddress(Builder builder)
    {
         this.id = builder.id;
        this.description = builder.description;
        this.postalCode = builder.postalCode;
        this.addressTypeId = builder.addressTypeId;
        this.date = builder.date;
        //this.state = builder.state;
    }

    public static class Builder
    {
        private Long id;
        private String description;
        private String postalCode;
        private String addressTypeId;
        private String date;
        //private String state;

        public Builder id(Long value){
            this.id =value;
            return this;
        }

        public Builder date(String value){
            this.date =value;
            return this;
        }

        public Builder description(String value){
            this.description =value;
            return this;
        }

        public Builder postalCode(String value){
            this.postalCode =value;
            return this;
        }

       /* public Builder state(String value){
            this.state =value;
            return this;
        }*/

        public Builder addressTypeId(String value){
            this.addressTypeId =value;
            return this;
        }

        public Builder copy(EmployeeAddress value){
            this.id = value.id;
            this.description = value.description;
            this.addressTypeId = value.addressTypeId;
            //this.state = value.state;
            this.date = value.date;
            this.postalCode = value.postalCode;
            return  this;
        }

        public EmployeeAddress build(){
            return new EmployeeAddress(this);
        }
    }


    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeAddress that = (EmployeeAddress) o ;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
