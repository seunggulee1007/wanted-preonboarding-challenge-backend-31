package com.wanted.ecommerce.webcore.advice.exceptions;

import com.wanted.ecommerce.webcore.advice.ErrorMessage;

public class UnauthorizedException extends DefaultException {

    public UnauthorizedException() {
        this.errorMessage = ErrorMessage.UNAUTHORIZED;
        this.message = "인증되지 않은 요청입니다.";
    }

    public UnauthorizedException(String message) {
        this.errorMessage = ErrorMessage.UNAUTHORIZED;
        this.message = message;
    }

}
