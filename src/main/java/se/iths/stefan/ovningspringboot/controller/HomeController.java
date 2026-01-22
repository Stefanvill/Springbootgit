package se.iths.stefan.ovningspringboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {


    @GetMapping("/greeting")
    public String home(Model model) {
        model.addAttribute("name", "Steffe");
        return "index";
    }

}
