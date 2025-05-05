package com.wanted.ecommerce.webcore.advice.exceptions;

import com.wanted.ecommerce.webcore.advice.ErrorMessage;
import lombok.Getter;

@Getter
public class DefaultException extends RuntimeException {

    protected ErrorMessage errorMessage;
    protected String message;

}
