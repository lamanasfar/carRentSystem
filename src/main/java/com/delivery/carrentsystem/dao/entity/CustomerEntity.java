package com.delivery.carrentsystem.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class CustomerEntity extends BaseEntity {
    private String firstName;
    private String lastName;
    private String fatherName;
    private String phoneNumber;
    private String finCode;
    private String identitySerialNumber;
    private String drivingLicenseNumber;
    private String driverLicenseImage;
    private String identityCardFrontImage;
    private String identityCardBackImage;
    private String address;
    private LocalDate birthDate;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false,unique = true)
    private UserEntity user;


}
