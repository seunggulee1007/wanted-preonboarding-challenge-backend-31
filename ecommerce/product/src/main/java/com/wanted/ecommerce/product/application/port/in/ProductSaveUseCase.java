package com.wanted.ecommerce.product.application.port.in;

import com.wanted.ecommerce.product.domain.Product;

public interface ProductSaveUseCase {

    Product saveProduct(ProductSaveCommand command);

}
