package com.eliseew.dima.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

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
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model
    ){
            model.addAttribute("message", ""+name+" "+surname);
//        System.out.printf(name+" "+surname);
        return "first/goodbye";
    }
    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "a", required = false) int a,
                             @RequestParam(value = "b", required = false) int b,
                             Model model){
        Map<String, Integer> a_b = new HashMap<>();
            a_b.put("a",a);
            a_b.put("b",b);
            model.addAllAttributes(a_b);
        return "first/calculator";
    }
}
