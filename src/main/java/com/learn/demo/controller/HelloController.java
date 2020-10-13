package com.learn.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林 v.linxh@gmail.com
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }


}
