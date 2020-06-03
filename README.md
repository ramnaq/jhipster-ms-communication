# JHipster microservices communication

This is a demonstration of how we can use [Spring Cloud
OpenFeign](https://start.jhipster.tech/generate-application) to implement
communication between [JHipster](jhipster.tech/) microservices. In other words,
it shows how to make a microservice call other with few code and provides an
abstraction for HTTP requests. After a few steps, calling a microservice from
other is as easy as calling a method.


## Components

In this repo you find two microservices [`client`](./client) and
[`server`](./server), where client calls server when a request is sent to it at
`/client/serverHello`, with a request parameter `name`. Both microservices were
generated with the official JHipster application generation tool, available
[here](https://start.jhipster.tech/generate-application).

In each microservice directory there is a README automatically generated,
containing more information about the JHipster application. That might help
when running, testing, debugging and troubleshooting.


## Running

In two different terminals, in the root of each microservice, run `sh gradlew`.
After this you should have client and server running respectively on ports
`8010` and `8020`.

Now simply perform a GET request to `/client/serverHello` passing a `name`
parameter.

```bash
[client] $ curl http://localhost:8010/client/serverHello?name=Salazar
```

The response should be: `What's up, Salazar! Server speaking`.
