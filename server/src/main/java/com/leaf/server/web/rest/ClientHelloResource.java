package com.leaf.server.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClientHelloResource controller
 */
@RestController
@RequestMapping("/api/client-hello")
public class ClientHelloResource {

    private final Logger log = LoggerFactory.getLogger(ClientHelloResource.class);

    /**
    * GET sayHiToServer
    */
    @GetMapping("/say-hi-to-server")
    public String sayHiToServer() {
        return "sayHiToServer";
    }

}
