package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-18.
 */
public class POS_Cashier extends Employee implements Serializable {
    private Long id;
    private String userName;
    private String password;
    private String empNum;
    private String empName;
    private String address;
    private String telephone;

    public POS_Cashier() {
    }

    public POS_Cashier(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.empNum = empNum;
        this.empName = empName;
        this.address = address;
        this.telephone = telephone;

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmpNum() {
        return empNum;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    public String getJobDescription() {
        return "Cashier is responsible for recording all transactions and ensuring accurate stock take";
    }

    @Override
    public void setNextStep(Employee nextStep) {
        super.setNextStep(nextStep);
    }

    public POS_Cashier(Builder builder)
    {
        this.id = builder.id;
        this.userName = builder.userName;
        this.password = builder.password;
        this.empNum = builder.empNum;
        this.empName = builder.empName;
        this.address = builder.address;
        this.telephone = builder.telephone;
    }

    public static class Builder{
        private Long id;
        private String userName;
        private String password;
        private String empNum;
        private String empName;
        private String address;
        private String telephone;

        public Builder id(Long value)
        {
            this.id = value;
            return this;

        }

        public Builder userName(String value)
        {
            this.userName = value;
            return this;

        }

        public Builder password(String value)
        {
            this.password = value;
            return this;

        }

        public Builder empNum(String value)
        {
            this.empNum = value;
            return this;

        }

        public Builder empName(String value)
        {
            this.empName = value;
            return this;

        }

        public Builder address(String value)
        {
            this.address = value;
            return this;

        }

        public Builder telephone(String value)
        {
            this.telephone = value;
            return this;

        }

        public Builder copy(POS_Cashier value)
        {
            this.id = value.id;
            this.userName = value.userName;
            this.password = value.password;
            this.empNum = value.empNum;
            this.empName = value.empName;
            this.address = value.address;
            this.telephone = value.telephone;
            return this;
        }

        public POS_Cashier build() {return new POS_Cashier(this);}


    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        POS_Cashier that = (POS_Cashier) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() { return id.hashCode();}
}
