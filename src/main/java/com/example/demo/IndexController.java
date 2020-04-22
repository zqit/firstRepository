package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("index")
    @ResponseBody
    public String Index(){
        System.out.println("2.0");
        return "hello idea springboot";
    }
}
