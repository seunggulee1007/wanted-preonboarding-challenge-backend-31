package com.wanted.webcore.advice.exceptions;

import com.wanted.webcore.advice.ErrorMessage;

public class ForbiddenException extends DefaultException {

    public ForbiddenException() {
        this.errorMessage = ErrorMessage.FORBIDDEN;
        this.message = "권한이 없는 요청입니다.";
    }

    public ForbiddenException(String message) {
        this.errorMessage = ErrorMessage.FORBIDDEN;
        this.message = message;
    }

}
