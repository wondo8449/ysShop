package com.app.ys.domain.notice.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class Notice extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noticeCode;

    @Column(nullable = false)
    private String noticeTitle;

    @Column(nullable = false)
    private String noticeContent;

    @Column(nullable = false)
    private String noticeWriter;

    @Column(nullable = false)
    private String noticeImage;

    @Column(nullable = false)
    private String noticeCount;

    @Column(nullable = false)
    private String noticeRegisterDate;

}
