package com.maestepabaena.rest.webservices.restufulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public HelloWorldBean helloWorld() {
        return new HelloWorldBean("Hello World");
    }
}
