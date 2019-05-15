package com.lee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lee.business.user.User;
import com.lee.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public String showPersons(Model model) {
        User persons = userService.findUser(1);
        model.addAttribute("persons", persons);
        return "showperson";
    }

}
