package com.app.ys.domain.orderDetail.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "orderDetails")
public class OrderDetail extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailCode;

    @Column(nullable = false)
    private String productPrice;

    @Column(nullable = false)
    private String productCount;

}
