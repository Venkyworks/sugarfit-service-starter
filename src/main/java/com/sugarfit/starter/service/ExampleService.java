
package com.sugarfit.starter.service;

import com.sugarfit.starter.dto.ExampleRequest;
import com.sugarfit.starter.dto.ExampleResponse;
import com.sugarfit.starter.util.RequestIdGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final RequestIdGenerator requestIdGenerator;

    public ExampleResponse process(ExampleRequest request) {
        return ExampleResponse.builder()
                .status("SUCCESS")
                .requestId(requestIdGenerator.generate())
                .build();
    }
}
