package com.wanted.ecommerce.webcore.advice;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorMessage {

    INVALID_INPUT("잘못된 입력 데이터", HttpStatus.BAD_REQUEST),
    RESOURCE_NOT_FOUND("요청한 리소스를 찾을 수 없음", HttpStatus.NOT_FOUND),
    UNAUTHORIZED("인증되지 않은 요청", HttpStatus.UNAUTHORIZED),
    FORBIDDEN("권한이 없는 요청", HttpStatus.FORBIDDEN),
    CONFLICT("리소스 충돌 발생", HttpStatus.CONFLICT),
    ;
    private final String description;
    private final HttpStatus httpStatus;

}
