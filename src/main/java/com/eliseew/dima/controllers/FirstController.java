package com.eliseew.dima.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest requesttt){
        String name = requesttt.getParameter("name");
        String surname = requesttt.getParameter("surname");
        System.out.println(name+" "+surname);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname){

        System.out.printf(name+" "+surname);
        return "first/goodbye";
    }
}
