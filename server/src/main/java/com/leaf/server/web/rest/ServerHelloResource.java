package com.leaf.server.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServerHelloResource controller
 */
@RestController
@RequestMapping("/api/server-hello")
public class ServerHelloResource {

    private final Logger log = LoggerFactory.getLogger(ServerHelloResource.class);

    /**
    * GET hi
    */
    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }

}
