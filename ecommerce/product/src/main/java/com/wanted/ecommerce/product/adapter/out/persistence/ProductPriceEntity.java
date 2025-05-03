package com.wanted.ecommerce.product.adapter.out.persistence;

import jakarta.persistence.*;

import java.util.Currency;

@Entity
@Table(name = "Product_Price")
public class ProductPriceEntity {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity product;
    /**
     * 기본 가격
     */
    private double basePrice;
    /**
     * 할인 가격
     */
    private double salePrice;
    /**
     * 원가
     */
    private double costPrice;
    /**
     * 통화 (기본값 KRW)
     */
    private Currency currency = Currency.getInstance("KRW");

    private double taxRate;

}
