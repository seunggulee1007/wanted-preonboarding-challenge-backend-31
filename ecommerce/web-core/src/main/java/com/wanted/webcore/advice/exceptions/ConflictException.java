package com.wanted.webcore.advice.exceptions;

import com.wanted.webcore.advice.ErrorMessage;

public class ConflictException extends DefaultException {

    public ConflictException() {
        this.errorMessage = ErrorMessage.UNAUTHORIZED;
        this.message = "리소스 충돌 발생했습니다.";
    }

    public ConflictException(String message) {
        this.errorMessage = ErrorMessage.UNAUTHORIZED;
        this.message = message;
    }

}
