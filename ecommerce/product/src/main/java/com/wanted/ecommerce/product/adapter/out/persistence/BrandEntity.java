package com.wanted.ecommerce.product.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name ="brand")
public class BrandEntity {

    @Id
    private Long id;
    /**
     * 브랜드 이름
     */
    private String name;
    /**
     * 브랜드 슬러그 (SEO 최적화용)
     */
    private String slug;
    /**
     * 브랜드 설명
     */
    private String description;
    /**
     * 브랜드 로고 이미지 URL
     */
    private String logoUrl;
    /**
     * 브랜드 웹사이트 URL
     */
    private String websiteUrl;

}
