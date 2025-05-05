package com.wanted.core.utils;

import lombok.Getter;

@Getter
public class ApiResult<T> {

    private boolean success;
    private T data;
    private String message;

    private ApiResult(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(true, data, "요청이 성공적으로 처리되었습니다.");
    }

    public static <T> ApiResult<T> success(T data, String message) {
        return new ApiResult<>(true, data, message);
    }


}
