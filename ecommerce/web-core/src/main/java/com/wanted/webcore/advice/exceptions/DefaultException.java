package com.wanted.webcore.advice.exceptions;

import com.wanted.webcore.advice.ErrorMessage;
import lombok.Getter;

@Getter
public class DefaultException extends RuntimeException {

    protected ErrorMessage errorMessage;
    protected String message;

}
