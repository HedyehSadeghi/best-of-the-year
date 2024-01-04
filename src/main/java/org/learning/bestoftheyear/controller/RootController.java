package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.YearDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String home(Model model) {
        YearDetails yearDetails = new YearDetails("hedy", 2023);
        model.addAttribute("year", yearDetails.getYear());
        model.addAttribute("name", yearDetails.getName());
        return "home";
    }


}
