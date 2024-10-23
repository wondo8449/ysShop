package com.app.ys.domain.user.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class User extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userCode;

    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private String userPhone;

    @Column(nullable = false)
    private String userAddress;

    @Column(nullable = false)
    private String userStatus;

    @Column
    private Long userKakaoId;

    @Column
    private String refreshToken;

}