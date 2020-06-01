package com.leaf.client.service;

import com.netflix.hystrix.config.HystrixConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


/**
 * name = the name of the service to be called, resolve by Eureka, used by the client-side LoadBalancer
 * url = overrides the default (requires 'name')
 * decode404 = fallback for mapping 404 to null
 * qualifier = changes the name of the Bean, which is the interface name by default
 * configuration = overrides the default feign configuration (which is config.FeignConfiguration). Can be used for things
 *      like providing a BasicAuthRequestInterceptor bean, with specific "user" and "password".
 * contextId = used differ FeignClients with different configurations, but that calls the same service
 */
@FeignClient(name = "server", url = "http://localhost:8020",  decode404 = true)
public interface ServerClient {

    @GetMapping(value = "/server/hello")
    String sayHello(@RequestParam("clientName") String clientName);

}
