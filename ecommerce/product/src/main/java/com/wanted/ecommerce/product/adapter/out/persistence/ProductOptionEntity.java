package com.wanted.ecommerce.product.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "Product_Option")
public class ProductOptionEntity {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_group_id")
    private ProductOptionGroupEntity productOptionGroup;

    /**
     * 옵션 이름 (ex: 빨강, 파랑)
     */
    private String name;

    /**
     * 추가 가격
     */
    private double additionalPrice;

    /**
     * 재고 관리 코드
     */
    private String sku;

    /**
     * 재고 수량
     */
    private int stock;

    /**
     * 표시 순서
     */
    private float displayOrder;

}
