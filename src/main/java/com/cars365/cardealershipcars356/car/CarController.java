package com.cars365.cardealershipcars356.car;

import com.cars365.cardealershipcars356.branch.Branch;
import com.cars365.cardealershipcars356.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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
    
    @PostMapping(path = "/pendingcar-bengaluru")
    public List<Car> carList(@RequestBody Branch branch) {
        return carService.getPendingCarsList(branch);
    }
    
    @PostMapping(path = "/sold")
    public List<Car> soldCars(@RequestBody Branch branch) {
        return carService.getSoldCarsList(branch);
    }
    
    @PostMapping(path = "/accept")
    @Transactional
    public void acceptCar(@RequestBody Car car){
        carService.acceptCar(car);
    }
}
