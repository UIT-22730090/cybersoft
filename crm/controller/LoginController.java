package com.nhphuc98.crm.controller;


import com.nhphuc98.crm.entity.User;
import com.nhphuc98.crm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("")
    public String login(){
        List<User> users = userRepository.findByEmailAndPassword("nguyenvana@gmail.com", "123456");

        for (User item : users){
            System.out.println("Kiem tra: " + item.getEmail());
        }

        return "login";
    }

    @PostMapping
    public String processLogin(@RequestParam String email,
                               @RequestParam String password,
                               Model model){

        List<User> users = userRepository.findByEmailAndPassword(email, password);

        boolean isSuccess = false;
        if(users.size() > 0){
            isSuccess = true;
            return "index";
        } else {
            isSuccess = false;
        }

        model.addAttribute("isSuccess", isSuccess);

        return "login";
    }

}
