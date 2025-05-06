package com.wanted.ecommerce.product.application.port.in;

import com.wanted.ecommerce.product.domain.ProductStatus;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class ProductSaveCommand {

    private Long id;
    private String name;
    private String slug;
    private String shortDescription;
    private String fullDescription;
    private ProductStatus status;
    private List<ProductDetailSaveCommand> details;
    private List<ProductOptionGroupSaveCommand> optionGroups;
    private Long sellerId;
    private Long brandId;
    private List<ProductImageSaveCommand> images;
    private List<Long> tags;

    @Getter
    @Builder
    @ToString
    @EqualsAndHashCode
    public static class ProductDetailSaveCommand {

        private Long id;
        private int weight;
        private DimensionsSaveCommand dimensions;
        private String materials;
        private String countryOfOrigin;
        private String warrantyInfo;
        private String careInstructions;
        private AdditionalInfoSaveCommand additionalInfo;

        @Getter
        @Builder
        @ToString
        @EqualsAndHashCode
        public static class DimensionsSaveCommand {

            private int width;
            private int height;
            private int depth;

        }

        @Getter
        @Builder
        @ToString
        @EqualsAndHashCode
        public static class AdditionalInfoSaveCommand {

            private boolean assemblyRequired;
            private String assemblyTime;

        }

    }

    @Getter
    @Builder
    @ToString
    @EqualsAndHashCode
    public static class ProductOptionGroupSaveCommand {

        private Long id;
        private String name;
        private float displayOrder;
        private List<ProductOptionSaveCommand> options;

        @Getter
        @Builder
        @ToString
        @EqualsAndHashCode
        public static class ProductOptionSaveCommand {

            private Long id;
            private String name;
            private Long additionalPrice;
            private String sku;
            private int stock;
            private float displayOrder;

        }

    }

    @Getter
    @Builder
    @ToString
    @EqualsAndHashCode
    public static class ProductImageSaveCommand {

        private String url;
        private String altText;
        private boolean primary;
        private float displayOrder;
        private Long optionId;

    }

}
