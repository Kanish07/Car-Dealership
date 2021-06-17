package com.cars365.cardealership.car;

import com.cars365.cardealership.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/car")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @PostMapping(path = "/bengaluru")
    public List<Car> getCar(@RequestBody Customer customer){
        return carService.getCarBengaluru(customer);
    }

    @PostMapping(path = "/pune")
    public List<Car> getCarPune(@RequestBody Customer customer){
        return carService.getCarPune(customer);
    }

    @PostMapping(path = "/chennai")
    public List<Car> getCarchennai(@RequestBody Customer customer){
        return carService.getCarchennai(customer);
    }

    @PostMapping(path = "/yourcarlist")
    public List<Car> carList(@RequestBody Customer customer) {
        return carService.getCarList(customer);
    }

    @PostMapping(path = "/delete")
    public String deleteCar(@RequestBody Car car){
        return carService.deleteCar(car);
    }

    @PostMapping(path = "/register-car")
    public void registerCar(@RequestBody Car car){
        carService.addCar(car);
    }
}
