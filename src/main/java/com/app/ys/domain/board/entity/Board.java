package com.app.ys.domain.board.entity;

import com.app.ys.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "boards")
public class Board extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardCode;

    @Column(nullable = false)
    private String boardStatus;

    @Column(nullable = false)
    private String boardTitle;

    @Column(nullable = false)
    private String boardRegisterDate;

    @Column
    private String boardContent;

    @Column
    private String boardImage;

    @Column
    private String baordRating;

}
