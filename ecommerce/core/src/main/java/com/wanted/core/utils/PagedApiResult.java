package com.wanted.core.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PagedApiResult<T extends List> {

    private boolean success;
    private T items;
    private Pagination pagination;
    private String message;

    public static <T extends List> PagedApiResult<T> of(boolean success, T items, Pagination pagination, String message) {
        return new PagedApiResult<>(success, items, pagination, message);
    }

}
