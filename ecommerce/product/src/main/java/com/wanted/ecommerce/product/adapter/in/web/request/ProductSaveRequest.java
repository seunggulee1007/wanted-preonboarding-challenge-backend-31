package com.wanted.ecommerce.product.adapter.in.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wanted.ecommerce.product.application.port.in.ProductSaveCommand;
import com.wanted.ecommerce.product.domain.ProductStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ProductSaveRequest {

    private String name;
    private String slug;
    private String shortDescription;
    private String fullDescription;
    private Long sellerId;
    private Long brandId;
    private ProductStatus status;
    private ProductDetailSaveRequest detail;
    private PriceSaveRequest price;
    private List<CategorySaveRequest> categories;
    private List<ProductOptionGroupSaveRequest> optionGroups;
    private List<ProductImageSaveRequest> images;
    private List<Long> tags;

    public ProductSaveCommand toCommand() {
        return ProductSaveCommand.builder()
            .name(this.name)
            .slug(this.slug)
            .shortDescription(this.shortDescription)
            .fullDescription(this.fullDescription)
            .sellerId(this.sellerId)
            .brandId(this.brandId)
            .status(this.status)
            .build();
    }

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public static class ProductDetailSaveRequest {

        private int weight;
        private DimensionsSaveRequest dimensions;
        private String materials;
        private String countryOfOrigin;
        private String warrantyInfo;
        private String careInstructions;
        private AdditionalInfoSaveRequest additionalInfo;

        public int getDimensionsWidth() {
            return dimensions != null ? dimensions.getWidth() : 0;
        }

        public int getDimensionsHeight() {
            return dimensions != null ? dimensions.getHeight() : 0;
        }

        public int getDimensionsDepth() {
            return dimensions != null ? dimensions.getDepth() : 0;
        }

        public boolean isAssemblyRequired() {
            return additionalInfo != null && additionalInfo.isAssemblyRequired();
        }

        public String getAssemblyTime() {
            return additionalInfo != null ? additionalInfo.getAssemblyTime() : null;
        }

        @Getter
        @Setter
        @ToString
        @EqualsAndHashCode
        public static class DimensionsSaveRequest {

            private int width;
            private int height;
            private int depth;

        }

        @Getter
        @Setter
        @ToString
        @EqualsAndHashCode
        public static class AdditionalInfoSaveRequest {

            private boolean assemblyRequired;
            private String assemblyTime;

        }

    }

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public static class PriceSaveRequest {

        private Long basePrice;

        private Long salePrice;
        private Long costPrice;
        private String currency;
        private float taxRate;

    }

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public static class CategorySaveRequest {

        private Long categoryId;
        @JsonProperty("is_primary")
        private boolean primary;

    }

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public static class ProductOptionGroupSaveRequest {

        private String name;
        private float displayOrder;
        private List<ProductOptionSaveRequest> options;

        @Getter
        @Setter
        @ToString
        @EqualsAndHashCode
        public static class ProductOptionSaveRequest {

            private String name;
            private Long additionalPrice;
            private String sku;
            private float displayOrder;

        }

    }

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public static class ProductImageSaveRequest {

        private String url;
        private String altText;
        @JsonProperty("is_primary")
        private boolean primary;
        private float displayOrder;
        private Long optionId;

    }

}
