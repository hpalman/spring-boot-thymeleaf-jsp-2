package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/address")
public class HomeController {
    @GetMapping(value = "/thymeleaf")
    public String address(Model model) {
        model.addAttribute("name", "thymeleaf");
        return "thymeleaf/address"; // address.html 파일을 사용해 렌더링
    }

    @GetMapping(value = "/jsp")
    public String jsp(Model model) {
        model.addAttribute("name","jsp");
        return "address"; // address.jsp 파일을 사용해 렌더링
    }
}
