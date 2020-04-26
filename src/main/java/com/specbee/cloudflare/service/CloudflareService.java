package com.specbee.cloudflare.service;

import com.specbee.cloudflare.domain.Cloudflare;
import com.specbee.cloudflare.domain.CloudflareResponse;
import com.specbee.cloudflare.web.rest.CloudflareResource;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CloudflareService {

    private static final String zoneId = "804e9577d5b1b52f60e7abb0577d0b68";
    private static final String cloudFlareToken = "17e43f38f3473d62b674f397232a0aecd9ed9";
    private static final String cloudFlareEmail = "deepan@specbee.com";
    private static final String cloudFlareUri = "https://api.cloudflare.com/client/v4/zones/"+ zoneId +"/purge_cache";
    private final RestTemplate restTemplate;

    public CloudflareService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CloudflareResponse clearCache() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Email", cloudFlareEmail);
        headers.set("X-Auth-Key", cloudFlareToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Cloudflare> request = new HttpEntity<Cloudflare>(new Cloudflare(true), headers);
        CloudflareResponse response = restTemplate.postForObject(cloudFlareUri, request, CloudflareResponse.class);
        return response;
    }
}
