package com.cars365.cardealership.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {
    @Query("select c from Car c where c.carLocation = 'Bengaluru' and c.customer.customerPhno <> ?1")
    List<Car> findCarByCarLocation(long customer);

    @Query("select c from Car c where c.carLocation = 'Pune' and c.customer.customerPhno <> ?1")
    List<Car> findCarByCarLocation1(long customer);

    @Query("select c from Car c where c.carLocation = 'Chennai' and c.customer.customerPhno <> ?1")
    List<Car> findCarByCarLocation2(long customer);

    @Query("select c from Car c where c.customer.customerPhno = ?1")
    List<Car> findCarByCustomer_CustomerPhno(long customer);

    @Modifying
    @Query("update Car c set c.carStatus = 'SOLD' where c.carRegno = ?1")
    void updateCar(String carRegno);

    Optional<Car> findCarByCarRegno(String carRegno);
}
