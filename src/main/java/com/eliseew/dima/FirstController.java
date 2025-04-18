package com.eliseew.dima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/a")
    public String A(){
        System.out.printf("aaaaaaaaaaaa");
        return "a";
    }
}
