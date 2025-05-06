package com.wanted.ecommerce.product.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@ToString
@EqualsAndHashCode
public class Product {

    private Long id;
    private String name;
    private String slug;
    private String shortDescription;
    private String fullDescription;
    private List<ProductDetail> details;
    private List<ProductOptionGroup> optionGroups;
    private Long sellerId;
    private Long brandId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Getter
    @ToString
    @EqualsAndHashCode
    private static class ProductOptionGroup {

        private Long id;
        private String name;
        private float displayOrder;
        private List<ProductOption> options;

        @Getter
        private static class ProductOption {

            private Long id;
            private String name;
            private Long additionalPrice;
            private String sku;
            private int stock;
            private float displayOrder;

        }

    }

    @Getter
    @ToString
    @EqualsAndHashCode
    private static class ProductDetail {

        private Long id;
        private int weight;
        private Dimensions dimensions;
        private String materials;
        private String countryOfOrigin;
        private String warrantyInfo;
        private String careInstructions;
        private AdditionalInfo additionalInfo;

        @Getter
        @ToString
        @EqualsAndHashCode
        private static class Dimensions {

            private int width;
            private int height;
            private int depth;

        }

        @Getter
        @ToString
        @EqualsAndHashCode
        private static class AdditionalInfo {

            private boolean assemblyRequired;
            private String assemblyTime;

        }

    }

}
