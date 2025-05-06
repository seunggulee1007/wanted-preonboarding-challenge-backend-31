package com.wanted.ecommerce.product.adapter.out.persistence;

import jakarta.persistence.Embeddable;

@Embeddable
public class DimensionsEntity {

    private int width;
    private int height;
    private int depth;

}
