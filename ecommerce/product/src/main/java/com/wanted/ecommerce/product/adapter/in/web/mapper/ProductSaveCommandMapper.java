package com.wanted.ecommerce.product.adapter.in.web.mapper;

import com.wanted.ecommerce.product.adapter.in.web.request.ProductSaveRequest;
import com.wanted.ecommerce.product.adapter.in.web.request.ProductSaveRequest.ProductDetailSaveRequest;
import com.wanted.ecommerce.product.adapter.in.web.request.ProductSaveRequest.ProductOptionGroupSaveRequest;
import com.wanted.ecommerce.product.application.port.in.ProductSaveCommand;
import com.wanted.ecommerce.product.application.port.in.ProductSaveCommand.ProductDetailSaveCommand;
import com.wanted.ecommerce.product.application.port.in.ProductSaveCommand.ProductDetailSaveCommand.AdditionalInfoSaveCommand;
import com.wanted.ecommerce.product.application.port.in.ProductSaveCommand.ProductDetailSaveCommand.DimensionsSaveCommand;
import com.wanted.ecommerce.product.application.port.in.ProductSaveCommand.ProductOptionGroupSaveCommand;
import com.wanted.ecommerce.product.application.port.in.ProductSaveCommand.ProductOptionGroupSaveCommand.ProductOptionSaveCommand;

import java.util.List;

public class ProductSaveCommandMapper {

    public static ProductSaveCommand toCommand(ProductSaveRequest request) {
        return ProductSaveCommand.builder()
            .name(request.getName())
            .slug(request.getSlug())
            .shortDescription(request.getShortDescription())
            .fullDescription(request.getFullDescription())
            .sellerId(request.getSellerId())
            .brandId(request.getBrandId())
            .status(request.getStatus())
            .details(toDetail(request.getDetail()))
            .optionGroups(toOptionGroups(request.getOptionGroups()))
            .images(toImages(request))
            .tags(request.getTags())
            .build();
    }

    private static List<ProductDetailSaveCommand> toDetail(ProductDetailSaveRequest r) {
        return List.of(ProductDetailSaveCommand.builder()
                           .weight(r.getWeight())
                           .dimensions(DimensionsSaveCommand.builder()
                                           .width(r.getDimensionsWidth())
                                           .height(r.getDimensionsHeight())
                                           .depth(r.getDimensionsDepth())
                                           .build())
                           .materials(r.getMaterials())
                           .countryOfOrigin(r.getCountryOfOrigin())
                           .warrantyInfo(r.getWarrantyInfo())
                           .careInstructions(r.getCareInstructions())
                           .additionalInfo(AdditionalInfoSaveCommand.builder()
                                               .assemblyRequired(r.isAssemblyRequired())
                                               .assemblyTime(r.getAssemblyTime())
                                               .build())
                           .build());
    }

    private static List<ProductOptionGroupSaveCommand> toOptionGroups(List<ProductOptionGroupSaveRequest> groupList) {
        return groupList.stream()
            .map(group -> ProductOptionGroupSaveCommand.builder()
                .name(group.getName())
                .displayOrder(group.getDisplayOrder())
                .options(group.getOptions().stream()
                             .map(option -> ProductOptionSaveCommand.builder()
                                 .name(option.getName())
                                 .additionalPrice(option.getAdditionalPrice())
                                 .sku(option.getSku())
                                 .displayOrder(option.getDisplayOrder())
                                 .build())
                             .toList())
                .build())
            .toList();
    }

    private static List<ProductSaveCommand.ProductImageSaveCommand> toImages(ProductSaveRequest request) {
        return request.getImages().stream()
            .map(image -> ProductSaveCommand.ProductImageSaveCommand.builder()
                .url(image.getUrl())
                .displayOrder(image.getDisplayOrder())
                .build())
            .toList();
    }

}
