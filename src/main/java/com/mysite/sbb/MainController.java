package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @ResponseBody
    @GetMapping("/")
    public String index() {
        System.out.println("index 메서드 호출");
        return "sbb";
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello 메서드 호출");
        return "안녕하세요";
    }
}
