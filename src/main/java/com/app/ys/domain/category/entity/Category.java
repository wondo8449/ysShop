package com.app.ys.domain.category.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "categorys")
public class Category extends TimeStamped  {

    @Id
    @Column(nullable = false)
    private Long categoryCode;

    @Column(nullable = false)
    private String categoryCode2;

    @Column(nullable = false)
    private String categoryName;

}
