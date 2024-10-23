package com.app.ys.domain.cart.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class Cart extends TimeStamped  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartCode;

    @Column(nullable = false)
    private String productCount;

    @Column(nullable = false)
    private String cartDate;

}
