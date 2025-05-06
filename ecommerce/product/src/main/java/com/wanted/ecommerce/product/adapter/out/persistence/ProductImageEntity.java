package com.wanted.ecommerce.product.adapter.out.persistence;

import com.wanted.ecommerce.generator.IdGenerator;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "Product_Image")
public class ProductImageEntity {

    @Id
    @IdGenerator
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    /**
     * 이미지 URL
     */
    private String url;

    /**
     * 대체 텍스트
     */
    private String altText;

    /**
     * 대표 이미지 여부
     */
    @Column(name = "is_primary")
    private boolean primary;

    /**
     * 표시 순서
     */
    private float displayOrder;

    /**
     * 연관된 옵션 ID
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_id")
    private ProductOptionEntity productOption;

}
