package com.delivery.carrentsystem.dao.repository;

import com.delivery.carrentsystem.dao.entity.CarImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CarImageRepository extends JpaRepository<CarImageEntity, Long> {
}
