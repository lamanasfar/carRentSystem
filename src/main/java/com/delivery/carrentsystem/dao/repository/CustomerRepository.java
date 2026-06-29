package com.delivery.carrentsystem.dao.repository;

import com.delivery.carrentsystem.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsByFinCode(String finCode);

    boolean existsByIdentitySerialNumber(String identitySerialNumber);

    boolean existsByDrivingLicenseNumber(String driverLicenseNumber);

}