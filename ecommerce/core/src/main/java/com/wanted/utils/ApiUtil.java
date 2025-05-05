package com.wanted.utils;


public class ApiUtil<T> {

    public ApiResult<T> success(T data) {
        return ApiResult.success(data);
    }

    public ApiResult<T> success(T data, String message) {
        return ApiResult.success(data, message);
    }

}
