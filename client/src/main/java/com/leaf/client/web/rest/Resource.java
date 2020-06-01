package com.leaf.client.web.rest;

import com.leaf.client.service.ServerClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloResource controller
 */
@RestController
public class Resource {

    private final Logger log = LoggerFactory.getLogger(Resource.class);

    private final ServerClient server;

    public Resource(ServerClient server) {
        this.server = server;
    }

    @GetMapping("/client/hello")
    public String helloAction() {
        log.info("Saying hello");
        return "Hello, Leaf!";
    }

    @GetMapping("/client/feign")
    public String sayHelloToServer(@RequestParam String myName) {
        log.info("{} is saying hello to server", myName);
        return server.sayHello(myName);
    }

}
