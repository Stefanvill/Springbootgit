package se.iths.stefan.ovningspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.stefan.ovningspringboot.model.User;
import se.iths.stefan.ovningspringboot.service.UserService;

import java.util.List;

@Controller
@RequestMapping
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUser(Model model) {
        List<User> userList = userService.userList();
        model.addAttribute("users", userList);
        return "user";
    }
}
