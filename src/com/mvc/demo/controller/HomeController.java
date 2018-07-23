package com.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v1/")
public class HomeController {

    @RequestMapping("main")
    public String showPage() {
        return "main-menu";
    }
}
