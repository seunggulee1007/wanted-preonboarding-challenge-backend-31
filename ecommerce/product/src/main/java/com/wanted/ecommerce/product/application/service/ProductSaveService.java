package com.wanted.ecommerce.product.application.service;

import com.wanted.ecommerce.product.application.port.in.ProductSaveCommand;
import com.wanted.ecommerce.product.application.port.in.ProductSaveUseCase;
import com.wanted.ecommerce.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductSaveService implements ProductSaveUseCase {

    @Override
    public Product saveProduct(ProductSaveCommand command) {
        command.getSellerId();
        command.getBrandId();
        return null;
    }

}
