package com.app.ys.domain.admin.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "admins")
public class Admin extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminCode;

    @Column(nullable = false)
    private String adminEmail;

    @Column(nullable = false)
    private String adminName;

    @Column(nullable = false)
    private String adminPassword;

    @Column(nullable = false)
    private String adminKey;

}
