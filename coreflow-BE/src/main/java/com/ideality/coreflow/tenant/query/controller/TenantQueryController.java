package com.ideality.coreflow.tenant.query.controller;

import com.ideality.coreflow.common.response.APIResponse;
import com.ideality.coreflow.tenant.query.service.TenantQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tenant")
@RequiredArgsConstructor
public class TenantQueryController {

    private final TenantQueryService tenantQueryService;

    @GetMapping("/find-all")
    public ResponseEntity<APIResponse<?>> findAllTenant() {
        return ResponseEntity.ok(APIResponse.success(tenantQueryService.findAllTenant(), "스키마 목록 조회"));
    }
}
