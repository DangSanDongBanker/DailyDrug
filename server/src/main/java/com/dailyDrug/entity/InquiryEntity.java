package com.dailyDrug.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Setter
@Table(name = "inquiry")
public class InquiryEntity {

    @Id
    @Column(name = "registry_id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer registryId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productId;

    @ManyToOne
    @JoinColumn(name = "user_code")
    private UserEntity userCode;

    @Column(name = "answer_check")
    private Integer answerCheck;

    @CreationTimestamp
    @Column(name = "registration_date")
    private LocalDateTime registrationDate;

    @Column(name = "contents")
    private String contents;

    @Column(name = "answer_contents")
    private String answerContents;

    @Builder //Lombok 프로젝트의 기능 중 하나로, 빌더 패턴을 자동으로 생성(get, set)
    public InquiryEntity(Integer registryId, ProductEntity productId, UserEntity userCode, Integer answerCheck, LocalDateTime registrationDate, String contents,
                         String answerContents) {
        this.registryId = registryId;
        this.productId = productId;
        this.userCode = userCode;
        this.answerCheck = answerCheck;
        this.registrationDate = registrationDate;
        this.contents = contents;
        this.answerContents = answerContents;
    }
}
