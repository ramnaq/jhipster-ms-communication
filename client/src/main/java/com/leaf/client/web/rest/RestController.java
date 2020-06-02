package com.leaf.client.web.rest;

import com.leaf.client.service.ServerClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final Logger log = LoggerFactory.getLogger(RestController.class);

    private final ServerClient server;

    public RestController(ServerClient server) {
        this.server = server;
    }

    @GetMapping("/client/hello")
    public String helloAction() {
        log.info("Client saying hello");
        return "Hi!";
    }

    @GetMapping("/client/serverHello")
    public String sayHelloToServer(@RequestParam String name) {
        log.info("{} is saying hello to server.", name);
        return server.sayHello(name);
    }

}
