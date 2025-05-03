package com.wanted.ecommerce.product.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "Product_Detail")
public class ProductDetailEntity {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity product;
    /**
     * 무게
     */
    private int weight;
    /**
     * 크기
     */
    @Column(columnDefinition = "json")
    private String dimension;
    /**
     * 소재정보
     */
    private String material;
    /**
     * 원산지
     */
    private String countryOfOrigin;
    /**
     * 보증정보
     */
    private String warrantyInfo;
    /**
     * 관리 지침
     */
    private String careInstructions;
    /**
     * 추가 정보
     */
    @Lob
    @Column(columnDefinition = "JSONB")
    private String additionalInfo;

}
