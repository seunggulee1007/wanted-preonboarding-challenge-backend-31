package com.wanted.ecommerce.core.utils;

import lombok.Getter;

@Getter
public class Pagination {

    private int totalItems;
    private int totalPages;
    private int currentPage;
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
