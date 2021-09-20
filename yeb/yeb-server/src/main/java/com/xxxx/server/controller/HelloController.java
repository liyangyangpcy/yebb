package com.xxxx.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : liyangyang
 * @date :2021/7/14/014 18:24
 * @description :test 测试
 * @ClassName: HelloController
 **/

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "/hello";
    }

    @GetMapping("/employee/basic/hello")
    public String hello2() {
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/hello")
    public String hello3() {
        return "/employee/advanced/hello";
    }

}