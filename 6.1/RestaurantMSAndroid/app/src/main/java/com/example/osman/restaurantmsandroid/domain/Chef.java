package com.example.osman.restaurantmsandroid.domain;


import java.io.Serializable;

public class Chef extends Employee implements Serializable {
    private Long id;
    private String userName;
    private String password;
    private String empNum;
    private String empName;
    private String address;
    private String telephone;

    public Chef(Long id, String userName, String password, String empNum, String empName, String address, String telephone) {

        this.id = id;
        this.userName = userName;
        this.password = password;
        this.empNum = empNum;
        this.empName = empName;
        this.address = address;
        this.telephone = telephone;
    }

    public Chef(Builder builder) {
        this.id = builder.id;
        this.userName = builder.userName;
        this.password = builder.password;
        this.empNum =  builder.empNum;
        this.empName = builder.empName;
        this.address = builder.address;
        this.telephone = builder.telephone;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public Long getId() {
        return id;
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

        public Builder copy(Chef value) {
            this.id = value.id;
            this.userName = value.userName;
            this.password = value.password;
            this.empNum = value.empNum;
            this.empName = value.empName;
            this.address = value.address;
            this.telephone = value.telephone;

            return this;
        }

        public Chef build() {return new Chef(this);}

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Chef that = (Chef) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() { return id.hashCode();}


}