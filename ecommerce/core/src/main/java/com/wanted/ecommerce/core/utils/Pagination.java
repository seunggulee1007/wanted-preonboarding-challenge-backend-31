package com.wanted.ecommerce.core.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Pagination {

    @JsonProperty("total_items")
    private int totalItems;
    @JsonProperty("total_pages")
    private int totalPages;
    @JsonProperty("current_page")
    private int currentPage;
    @JsonProperty("per_page")
    private int perPage;

    private Pagination(int totalItems, int totalPages, int currentPage, int perPage) {
        this.totalItems = totalItems;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.perPage = perPage;
    }

    public static Pagination of(int totalItems, int totalPages, int currentPage, int perPage) {
        return new Pagination(totalItems, totalPages, currentPage, perPage);
    }

}
