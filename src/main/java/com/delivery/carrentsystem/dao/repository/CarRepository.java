package com.delivery.carrentsystem.dao.repository;

import com.delivery.carrentsystem.dao.entity.CarEntity;
import com.delivery.carrentsystem.enums.CarStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CarEntity, Long> {

    List<CarEntity> findAllByStatus(CarStatus status);

    boolean existsByPlateNumber(String plateNumber);

    boolean existsByVinCode(String vinCode);

}