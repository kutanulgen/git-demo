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

    @GetMapping("3")
    public String demo3() {
        return "demo3";
    }

    @GetMapping("4")
    public String demo4() {
        return "demo3";
    }

    @GetMapping("6")
    public String demo6() {
        return "demo6";
    }
}
