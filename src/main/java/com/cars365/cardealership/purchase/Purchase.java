package com.cars365.cardealership.purchase;

import com.cars365.cardealership.car.Car;
import com.cars365.cardealership.customer.Customer;

import javax.persistence.*;

@Entity
@Table
public class Purchase {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Car car;

    public Purchase() {
    }

    public Purchase(Long id, Customer customer, Car car) {
        this.id = id;
        this.customer = customer;
        this.car = car;
    }

    public Purchase(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
