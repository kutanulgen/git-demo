package com.kutan.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("")
    public String demo() {
        return "demo";
    }

    @GetMapping("1")
    public String demo1() {
        return "demo1";
    }

    @GetMapping("2")
    public String demo2() {
        return "demo2";
    }
}
