package com.maestepabaena.rest.webservices.restufulwebservices;

public class HelloWorldBean {

    private final String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    //without the getter the rest services will not work
    public String getMessage() {
        return message;
    }

}
