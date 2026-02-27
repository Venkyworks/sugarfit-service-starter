
package com.sugarfit.starter.controller;

import com.sugarfit.starter.dto.SugarfitRequest;
import com.sugarfit.starter.dto.SugarfitResponse;
import com.sugarfit.starter.service.SugarfitService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class SugarfitController {

    private final SugarfitService sugarfitService;

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("UP");
    }

    @PostMapping("/example")
    public ResponseEntity<SugarfitResponse> process(@Valid @RequestBody SugarfitRequest request) {
        log.info("Processing request for userId={}", request.getUserId());
        return ResponseEntity.ok(sugarfitService.process(request));
    }
}
