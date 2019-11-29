package com.fpi.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "PEM")
public interface SchedualServiceHello  {

    @RequestMapping("/hello")
    String loginFromPem(int a);
}
