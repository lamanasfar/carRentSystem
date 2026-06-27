package com.delivery.carrentsystem.dao.entity;


import com.delivery.carrentsystem.enums.CarStatus;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")
@Builder
public class CarEntity extends BaseEntity {
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private Integer year;
    @Column(nullable = false,unique = true)
    private String plateNumber;
    @Column(nullable = false,unique = true)
    private String vinCode;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false,precision = 10,scale = 2)
    private BigDecimal dailyPrice;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CarStatus status;


    private String leasingCompany;
    private LocalDate leasingStartDate;
    private LocalDate leasingEndDate;
    private String insuranceCompany;
    private LocalDate insuranceStartDate;
    private LocalDate insuranceEndDate;
    private LocalDate technicalInspectionDate;

    @OneToMany(mappedBy = "car",cascade =CascadeType.ALL,orphanRemoval = true)
    @Builder.Default
    private List<CarImageEntity> images = new ArrayList<>();

    @OneToMany(mappedBy = "car")
    @Builder.Default
    private List<RentalEntity> rentals = new ArrayList<>();


}
