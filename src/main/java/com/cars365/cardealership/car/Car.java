package com.cars365.cardealership.car;

import com.cars365.cardealership.customer.Customer;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table
public class Car {
    @Id
    private String carRegno;
    private String carMake;
    private String carType;
    private String carFuel;
    private String carShift;
    private String carOwnercount;
    private Double carPrice;
    private int carYear;
    private String carLocation;
    private String carStatus = "ACTIVE";
    @ManyToOne
    private Customer customer;

    public Car() {
    }

    public Car(String carRegno, String carMake, String carType, String carFuel, String carShift, String carOwnercount, Double carPrice, int carYear, String carLocation, String carStatus, Customer customer) {
        this.carRegno = carRegno;
        this.carMake = carMake;
        this.carType = carType;
        this.carFuel = carFuel;
        this.carShift = carShift;
        this.carOwnercount = carOwnercount;
        this.carPrice = carPrice;
        this.carYear = carYear;
        this.carLocation = carLocation;
        this.carStatus = carStatus;
        this.customer = customer;
    }

    public String getCarRegno() {
        return carRegno;
    }

    public void setCarRegno(String carRegno) {
        this.carRegno = carRegno;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(String carFuel) {
        this.carFuel = carFuel;
    }

    public String getCarShift() {
        return carShift;
    }

    public void setCarShift(String carShift) {
        this.carShift = carShift;
    }

    public String getCarOwnercount() {
        return carOwnercount;
    }

    public void setCarOwnercount(String carOwnercount) {
        this.carOwnercount = carOwnercount;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarLocation() {
        return carLocation;
    }

    public void setCarLocation(String carLocation) {
        this.carLocation = carLocation;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carRegno='" + carRegno + '\'' +
                ", carMake='" + carMake + '\'' +
                ", carType='" + carType + '\'' +
                ", carFuel='" + carFuel + '\'' +
                ", carShift='" + carShift + '\'' +
                ", carOwnercount='" + carOwnercount + '\'' +
                ", carPrice=" + carPrice +
                ", carYear=" + carYear +
                ", carLocation='" + carLocation + '\'' +
                ", carStatus='" + carStatus + '\'' +
                ", customer=" + customer +
                '}';
    }
}
