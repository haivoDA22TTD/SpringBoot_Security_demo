package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
        public String home(){
            return home();
        }
    @GetMapping("/user")
        public String user(){
            return user();
        }
    @GetMapping("/admin")
        public String admin(){
            return admin();
        }
    @GetMapping("/login")
        public  String login(){
            return login();
        }
}
