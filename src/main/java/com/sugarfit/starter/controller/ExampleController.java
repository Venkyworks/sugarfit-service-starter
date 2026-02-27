
package com.sugarfit.starter.controller;

import com.sugarfit.starter.dto.ExampleRequest;
import com.sugarfit.starter.dto.ExampleResponse;
import com.sugarfit.starter.service.ExampleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class ExampleController {

    private final ExampleService exampleService;

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("UP");
    }

    @PostMapping("/example")
    public ResponseEntity<ExampleResponse> process(@Valid @RequestBody ExampleRequest request) {
        log.info("Processing request for userId={}", request.getUserId());
        return ResponseEntity.ok(exampleService.process(request));
    }
}
