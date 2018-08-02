package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model) {

        Date date = new Date();
        model.addAttribute("currenttime", date.toString());

        return "index";
    }
}
