package com.app.ys.domain.delivery.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class Delivery extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryCode;

    @Column(nullable = false)
    private String deliveryName;

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String deliveryAddress;

    @Column
    private String detailedAddress;

    @Column(nullable = false)
    private String deliveryPhone;

    @Column
    private String deliveryRequest;

    @Column(nullable = false)
    private Long deliveryDefault;

}
