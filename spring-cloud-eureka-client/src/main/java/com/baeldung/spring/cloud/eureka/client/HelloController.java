package com.baeldung.spring.cloud.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;

public interface HelloController {
    @RequestMapping("/")
    String hello();
}
