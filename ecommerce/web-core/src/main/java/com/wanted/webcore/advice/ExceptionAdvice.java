package com.wanted.webcore.advice;

import com.wanted.webcore.advice.exceptions.DefaultException;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        String message = e.getMessage();
        if(!StringUtils.hasText(message)) {
            message = "서버에서 알 수 없는 오류가 발생했습니다.";
        }
        ErrorResponse errorResponse = ErrorResponse.of(ErrorData.of(
            "INTERNAL_SERVER_ERROR",
            message
        ));
        return ResponseEntity.internalServerError().body(errorResponse);
    }

    @ExceptionHandler(DefaultException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(DefaultException e) {
        ErrorResponse errorResponse = ErrorResponse.of(ErrorData.of(
            e.getErrorMessage().name(),
            e.getMessage()
        ));
        return ResponseEntity.status(e.getErrorMessage().getHttpStatus()).body(errorResponse);
    }

    @Getter
    private static class ErrorResponse {
        private final boolean success = false;
        private ErrorData error;
        private ErrorResponse(ErrorData error) {
            this.error = error;
        }
        public static ErrorResponse of(ErrorData error) {
            return new ErrorResponse(error);
        }
    }

    @Getter
    private static class ErrorData {
        private String code;
        private String message;
        private ErrorDetails details;

        private ErrorData(String code, String message, ErrorDetails details) {
            this.code = code;
            this.message = message;
            this.details = details;
        }
        public static ErrorData of(String code, String message) {
            return new ErrorData(code, message, null);
        }

    }

    private class ErrorDetails {

    }

}
