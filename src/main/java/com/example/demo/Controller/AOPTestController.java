package com.example.demo.Controller;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lenovo
 * @Date: 2021-03-13 17:15
 * @Description:
 */
@RestController
public class AOPTestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("test方法执行");
        return "hello world";
    }
}
