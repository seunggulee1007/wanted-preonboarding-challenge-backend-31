package com.wanted.webcore.advice.exceptions;

import com.wanted.webcore.advice.ErrorMessage;

public class InvalidInputException extends DefaultException {

    public InvalidInputException() {
        this.errorMessage = ErrorMessage.INVALID_INPUT;
        this.message = "잘못된 입력입니다.";
    }

    public InvalidInputException(String message) {
        this.errorMessage = ErrorMessage.INVALID_INPUT;
        this.message = message;
    }

}
