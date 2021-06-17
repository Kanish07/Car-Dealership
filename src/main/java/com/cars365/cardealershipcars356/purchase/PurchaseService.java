package com.cars365.cardealershipcars356.purchase;

import com.cars365.cardealershipcars356.car.CarRepository;
import com.cars365.cardealershipcars356.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final CarRepository carRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository, CarRepository carRepository) {
        this.purchaseRepository = purchaseRepository;
        this.carRepository = carRepository;
    }

    public Optional<Purchase> addPurchase(Purchase purchase){
            purchaseRepository.save(purchase);
            carRepository.updateCar(purchase.getCar().getCarRegno());
            return purchaseRepository.findPurchaseByCar(purchase.getCar().getCarRegno());
    }

    public List<Purchase> myPurchase(long customerPhno) {
        return purchaseRepository.findPurchase(customerPhno);
    }
}
