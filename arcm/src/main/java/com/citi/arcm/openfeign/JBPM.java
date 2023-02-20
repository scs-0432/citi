package com.citi.arcm.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "JBPM",url = "localhost:8084")
public interface JBPM {
    @PostMapping(value = "/test/testJBPM")
     String test();
}
