package com.cars365.cardealershipcars356.purchase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query("select p from Purchase p where p.car.carRegno = ?1")
    Optional<Purchase> findPurchaseByCar(String carRegno);

    @Query("select p from Purchase p where p.customer.customerPhno = ?1")
    List<Purchase> findPurchase(long customerPhno);
}
