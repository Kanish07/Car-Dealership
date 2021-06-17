package com.cars365.cardealership.purchase;

import com.cars365.cardealership.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping("/register")
    @Transactional
    public Optional<Purchase> addPurchase(@RequestBody Purchase purchase){
        return purchaseService.addPurchase(purchase);
    }

    @PostMapping("/record")
    public List<Purchase> myPurchase(@RequestBody Customer customer){
        return purchaseService.myPurchase(customer.getCustomerPhno());
    }
}
