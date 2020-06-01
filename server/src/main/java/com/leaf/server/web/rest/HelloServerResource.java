package com.leaf.server.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/hello-server")
public class HelloServerResource {

    private final Logger log = LoggerFactory.getLogger(HelloServerResource.class);

    @GetMapping("/server/hello")
    public String sayHello(@RequestParam String clientName) {
        //String clientName = "soy bean";
        log.info("{} saying hi. Saying hi to {}.", clientName, clientName);
        return "What's up, " + clientName + "? I'm the Water Server ^^";
    }

}
