    package com.example.HelloSpring.controllers;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.*;

    @Controller
    public class HelloSpringController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
            return "Hello, " + name + "!";
        }
    // /hello/form/
    @GetMapping("form")
    public String helloForm() {
        return "form";
        }
    }