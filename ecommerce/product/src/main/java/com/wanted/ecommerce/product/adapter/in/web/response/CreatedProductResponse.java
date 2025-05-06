package com.wanted.ecommerce.product.adapter.in.web.response;

import com.wanted.ecommerce.product.domain.Product;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreatedProductResponse {

    private Long id;
    private String name;
    private String slug;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static CreatedProductResponse from(Product product) {
        CreatedProductResponse response = new CreatedProductResponse();
        response.id = product.getId();
        response.name = product.getName();
        response.slug = product.getSlug();
        response.createdAt = product.getCreatedAt();
        response.updatedAt = product.getUpdatedAt();
        return response;
    }

}
