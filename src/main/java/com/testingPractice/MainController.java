package com.testingPractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    String course = "Software Testing";
    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("course", course);
        return "index";
    }
}
