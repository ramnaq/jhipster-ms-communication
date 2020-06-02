package com.leaf.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "server", url = "http://localhost:8020")
public interface ServerClient {

    @GetMapping(value = "/server/hello")
    String sayHello(@RequestParam("name") String name);

}
