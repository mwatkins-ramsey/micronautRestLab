package com.example.controller;

import com.example.model.Message;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class MessageController {

    @Get("/hello")
    public Message helloWorld(){
        return new Message(0L, "Hello World!");
    }
}
