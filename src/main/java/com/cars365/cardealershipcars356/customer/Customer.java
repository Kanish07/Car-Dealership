package com.cars365.cardealershipcars356.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
    @Id
    private long customerPhno;
    private String customerName;
    private String customerLocation;
    private String customerEmail;
    private String customerPassword;

    public Customer() {
    }

    public Customer(String customerName, long customerPhno, String customerLocation, String customerEmail, String customerPassword) {
        this.customerName = customerName;
        this.customerPhno = customerPhno;
        this.customerLocation = customerLocation;
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerPhno() {
        return customerPhno;
    }

    public void setCustomerPhno(long customerPhno) {
        this.customerPhno = customerPhno;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerPhno=" + customerPhno +
                ", customerLocation='" + customerLocation + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                '}';
    }
}
