package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-17.
 */

public class Employee implements Serializable{
    private Long id;
    private String empNum;
    private String empName;
    private String address;
    private String telephone;
    private Role role;

    Employee nextStep;

    public void setNextStep(Employee nextStep)
    {
        this.nextStep = nextStep;
    }

    //public abstract String handleRequest(int request);


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getEmpame() {
        return empName;
    }

    public void setEmpame(String empame) {
        this.empName = empame;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNum='" + empNum + '\'' +
                ", empame='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(Builder builder) {
        this.empNum = builder.empNum;
        this.empName = builder.empName;
        this.address = builder.address;
        this.telephone = builder.telephone;
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id != null ? id.equals(employee.id) : employee.id == null;
    }

    public static class Builder
    {
        private String empNum;
        private String empName;
        private String address;
        private String telephone;

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

        public Builder copy(Employee value) {
            this.empNum = value.empNum;
            this.empName = value.empName;
            this.address = value.address;
            this.telephone = value.telephone;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Builder builder = (Builder) o;

            if (!empNum.equals(builder.empNum)) return false;
            if (!empName.equals(builder.empName)) return false;
            if (!address.equals(builder.address)) return false;
            return telephone.equals(builder.telephone);

        }

        @Override
        public int hashCode() {
            int result = empNum.hashCode();
            result = 31 * result + empName.hashCode();
            result = 31 * result + address.hashCode();
            result = 31 * result + telephone.hashCode();
            return result;
        }
    }
}
