package com.delivery.carrentsystem.dao.repository;

import com.delivery.carrentsystem.dao.entity.CarEntity;
import com.delivery.carrentsystem.dao.entity.CustomerEntity;
import com.delivery.carrentsystem.dao.entity.RentalEntity;
import com.delivery.carrentsystem.enums.RentalStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalRepository extends JpaRepository<RentalEntity, Long> {

    List<RentalEntity> findAllByStatus(RentalStatus status);

    List<RentalEntity> findAllByCustomer(CustomerEntity customer);

    List<RentalEntity> findAllByCar(CarEntity car);

}