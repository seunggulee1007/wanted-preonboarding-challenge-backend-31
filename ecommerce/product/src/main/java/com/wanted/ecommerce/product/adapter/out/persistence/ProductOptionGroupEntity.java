package com.wanted.ecommerce.product.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "Product_Option_Group")
public class ProductOptionGroupEntity {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    /**
     * 옵션 그룹 이름 (ex: 색상, 사이즈)
     */
    private String name;

    /**
     * 표시 순서
     */
    private float displayOrder;


}
