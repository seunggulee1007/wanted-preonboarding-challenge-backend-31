package com.wanted.ecommerce.core.utils;

import java.util.List;

public class PagedApiUtil<T extends List> {

    public PagedApiResult<T> success(T items, Pagination pagination) {
        return PagedApiResult.of(true, items, pagination, "요청이 성공적으로 처리되었습니다.");
    }

    public PagedApiResult<T> success(T items, Pagination pagination, String message) {
        return PagedApiResult.of(true, items, pagination, message);
    }

}
