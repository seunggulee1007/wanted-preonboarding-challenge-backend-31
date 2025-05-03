package com.wanted.ecommerce.product.adapter.out.persistence;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductStatus {
    /**
     * 판매중
     */
    ON_SALE("판매중"),
    SOLD_OUT("판매완료"),
    /**
     * 판매중지
     */
    STOP_SELLING("판매중지"),
    /**
     * 삭제됨
     */
    DELETED("삭제됨"),
    ;
    private final String status;

}
