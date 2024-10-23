package com.app.ys.domain.product.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "products")
public class Product extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productCode;

    @Column(nullable = false)
    private String categoryCode2;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private String Image1;

    @Column
    private String Image2;

    @Column
    private String Image3;

    @Column
    private String Image4;

    @Column
    private String Image5;

    @Column(nullable = false)
    private String productInfo;

    @Column(nullable = false)
    private String regularPrice;

    @Column
    private String salePrice;

    @Column(nullable = false)
    private Long productRegisterDate;

    @Column(nullable = false)
    private String productStock;

    @Column(nullable = false)
    private String productStatus;

}
