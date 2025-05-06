package com.wanted.ecommerce.product.adapter.in.web;

import com.wanted.ecommerce.core.utils.ApiResult;
import com.wanted.ecommerce.product.adapter.in.web.mapper.ProductSaveCommandMapper;
import com.wanted.ecommerce.product.adapter.in.web.request.ProductSaveRequest;
import com.wanted.ecommerce.product.adapter.in.web.response.CreatedProductResponse;
import com.wanted.ecommerce.product.application.port.in.ProductSaveUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.wanted.ecommerce.core.utils.ApiResult.success;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductCommandController {

    private final ProductSaveUseCase productSaveUseCase;

    @PostMapping
    public ApiResult<CreatedProductResponse> createProduct(ProductSaveRequest request) {
        return success(CreatedProductResponse.from(productSaveUseCase.saveProduct(ProductSaveCommandMapper.toCommand(request))));
    }

}
