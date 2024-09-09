package com.akashit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greet-api") // Use the updated name
public interface GreetFeignClient {
    
    @GetMapping("/greet")
    String invokeGreetApi();
}
