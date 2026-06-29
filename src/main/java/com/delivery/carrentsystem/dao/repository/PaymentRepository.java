package com.delivery.carrentsystem.dao.repository;

import com.delivery.carrentsystem.dao.entity.PaymentEntity;
import com.delivery.carrentsystem.enums.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

    List<PaymentEntity> findAllByStatus(PaymentStatus status);

}
