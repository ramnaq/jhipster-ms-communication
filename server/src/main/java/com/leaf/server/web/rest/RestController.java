package com.leaf.server.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final Logger log = LoggerFactory.getLogger(RestController.class);

    @GetMapping("/server/hello")
    public String sayHello(@RequestParam String name) {
        log.info("Server: {} saying hi to me.", name);
        return "What's up, " + name + "? Server speaking";
    }

}
