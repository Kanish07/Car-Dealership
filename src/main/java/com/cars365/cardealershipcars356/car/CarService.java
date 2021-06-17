package com.cars365.cardealershipcars356.car;

import com.cars365.cardealershipcars356.branch.Branch;
import com.cars365.cardealershipcars356.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
    public List<Car> getPendingCarsList(Branch branch) {
		return carRepository.findCarBypending(branch.getBranchLocation());
	}

	public void acceptCar(Car car) {
		carRepository.acceptCar(car.getCarRegno());
	}

	public List<Car> getSoldCarsList(Branch branch) {
		return carRepository.findCarBySold(branch.getBranchLocation());
	}
}
