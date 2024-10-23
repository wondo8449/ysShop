package com.app.ys.domain.order.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "orders")
public class Order extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderCode; // 주문코드

    @Column(nullable = false)
    private String totalPrice; // 합계가격

    @Column(nullable = false)
    private String orderDate; // 주문일자

    @Column(nullable = false)
    private String paymentMethod; // 결제방식

    @Column(nullable = false)
    private String paymentCard; // 결제카드

    @Column(nullable = false)
    private String paymentDate; // 결제일자

    @Column(nullable = false)
    private String orderStatus; // 주문상태

    @Column(nullable = false)
    private String refundReason; // 환불사유

    @Column(nullable = false)
    private String recipientName; // 받는분이름

    @Column(nullable = false)
    private String zipCode; // 우편번호

    @Column(nullable = false)
    private String recipientAddress; // 받는분주소

    @Column(nullable = false)
    private Long detailedAddress; // 상세주소

    @Column(nullable = false)
    private String recipientPhone; // 받는분번호

    @Column(nullable = false)
    private String deliveryRequest; // 배송요청사항

    @Column(nullable = false)
    private String productCount; // 제품갯수

    @Column(nullable = false)
    private String mainProduct; // 메인상품

    @Column(nullable = false)
    private String mainImage; // 메인이미지

}
