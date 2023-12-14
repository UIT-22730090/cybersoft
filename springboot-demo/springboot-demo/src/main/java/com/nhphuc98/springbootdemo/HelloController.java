package com.nhphuc98.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping()
public class HelloController {

    @GetMapping("/greeting")
    public String greeting(){
        return "greeting";
    }

    @PostMapping("/welcome")
    public String welcome(@RequestParam String name,
                          Model model){
        model.addAttribute("name", name);
        return "welcome";
    }

}
