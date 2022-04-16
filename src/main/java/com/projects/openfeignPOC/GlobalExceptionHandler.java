package com.projects.openfeignPOC;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ErrorInfo handleFeignException(ApiException apiException, HttpServletResponse response) {
        return new ErrorInfo(apiException.getError());
    }
}
