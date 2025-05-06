package com.wanted.ecommerce.product.adapter.out.persistence;

import com.wanted.ecommerce.generator.IdGenerator;
import jakarta.persistence.*;

@Entity
@Table(name = "Product_Category")
public class ProductCategoryEntity {

    @Id
    @IdGenerator
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    private Long categoryId;

    @Column(name = "is_primary")
    private boolean primary;

}
