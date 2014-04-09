package com.mycompany.example

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/helloworld")
    public HelloWorld greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {

        return new HelloWorld(counter.incrementAndGet(), String.format(template, name));
    }
}