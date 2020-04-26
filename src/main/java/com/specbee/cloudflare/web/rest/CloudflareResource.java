package com.specbee.cloudflare.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.specbee.cloudflare.domain.CloudflareResponse;
import com.specbee.cloudflare.service.CloudflareService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudflare")
public class CloudflareResource {

    private final CloudflareService cloudflareService;

    public CloudflareResource(CloudflareService cloudflareService) {
        this.cloudflareService = cloudflareService;
    }

    @GetMapping("/clear_cache")
    @Timed
    public CloudflareResponse clearCloudflareCahce() {
        return cloudflareService.clearCache();
    }
}
