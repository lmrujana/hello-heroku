package com.company.Helloheroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloHerokuController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String sayHelloHeroku(){
        return "Hello, Heroku!";
    }

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String syHelloToName(@PathVariable String name){
        return "What's happening, " + name + "?";
    }
}
