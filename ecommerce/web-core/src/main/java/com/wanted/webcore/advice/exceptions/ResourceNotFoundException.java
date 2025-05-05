package com.wanted.webcore.advice.exceptions;

import com.wanted.webcore.advice.ErrorMessage;

public class ResourceNotFoundException extends DefaultException {

    public ResourceNotFoundException() {
        this.errorMessage = ErrorMessage.RESOURCE_NOT_FOUND;
        this.message = "요청한 리소스를 찾을 수 없습니다.";
    }

    public ResourceNotFoundException(String message) {
        this.errorMessage = ErrorMessage.RESOURCE_NOT_FOUND;
        this.message = message;
    }

}
