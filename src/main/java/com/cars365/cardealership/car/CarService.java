package com.cars365.cardealership.car;

import com.cars365.cardealership.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> getCarBengaluru(Customer customer){
        return carRepository.findCarByCarLocation(customer.getCustomerPhno());
    }

    public List<Car> getCarPune(Customer customer){
        return carRepository.findCarByCarLocation1(customer.getCustomerPhno());
    }

    public List<Car> getCarchennai(Customer customer){
        return carRepository.findCarByCarLocation2(customer.getCustomerPhno());
    }

    public List<Car> getCarList(Customer customer){
        return carRepository.findCarByCustomer_CustomerPhno(customer.getCustomerPhno());
    }

    public void addCar(Car car) {
        Optional<Car> carByCarRegno = carRepository.findCarByCarRegno(car.getCarRegno());
        if(carByCarRegno.isPresent()){
            throw new IllegalStateException("Car already exists or Please use your registered Phone number");
        }
        carRepository.save(car);
    }

    public String deleteCar(Car car) {
        carRepository.delete(car);
        return "Deleted Successfully";
    }
}
