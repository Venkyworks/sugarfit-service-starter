
package com.sugarfit.starter.service;

import com.sugarfit.starter.dto.SugarfitRequest;
import com.sugarfit.starter.dto.SugarfitResponse;
import com.sugarfit.starter.util.RequestIdGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SugarfitService {

    private final RequestIdGenerator requestIdGenerator;

    public SugarfitResponse process(SugarfitRequest request) {
        return SugarfitResponse.builder()
                .status("SUCCESS")
                .requestId(requestIdGenerator.generate())
                .build();
    }
}
