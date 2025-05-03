package com.wanted.ecommerce.product.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "seller")
public class SellerEntity {

    @Id
    private Long id;

    /**
     * 판매자 이름
     */
    private String name;

    /**
     * 판매자 설명
     */
    private String description;

    /**
     * 로고 이미지 URL
     */
    private String logoUrl;

    /**
     * 평점
     */
    private double rating;

    /**
     * 연락처 이메일
     */
    private String contactEmail;

    /**
     * 연락처 전화번호
     */
    private String contactPhone;

    private LocalDateTime createdAt;

}