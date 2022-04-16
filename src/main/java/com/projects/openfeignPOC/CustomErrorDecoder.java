package com.projects.openfeignPOC;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() == 404)
            return new ApiException(response.status(), "Not Found", response.request().url());

        return defaultErrorDecoder.decode(methodKey, response);
    }
}
