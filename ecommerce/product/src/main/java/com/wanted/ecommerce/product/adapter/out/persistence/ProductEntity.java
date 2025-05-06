package com.wanted.ecommerce.product.adapter.out.persistence;

import com.wanted.ecommerce.product.domain.ProductStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
public class ProductEntity {

    @Id
    private Long id;
    private String name;
    /**
     * URL 슬러그 (SEO 최적화용)
     */
    private String slug;

    /**
     * 짧은 설명
     */
    private String shortDescription;

    /**
     * 전체 설명 (HTML 허용)
     */
    private String fullDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    private SellerEntity seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;

    private ProductStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductDetailEntity> productDetails = new ArrayList<>();
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductPriceEntity> productPrices = new ArrayList<>();
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductCategoryEntity> productCategories = new ArrayList<>();
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductOptionGroupEntity> productOptionGroups = new ArrayList<>();
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductImageEntity> productImages = new ArrayList<>();

}
