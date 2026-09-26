package com.pdev.rempms.communicationservice.config;

import feign.codec.ErrorDecoder;
import feign.Response;
import lombok.SneakyThrows;

public interface ClientErrorDecoder extends ErrorDecoder {

    @SneakyThrows
    Exception decode(String methodKey, Response response);
}
