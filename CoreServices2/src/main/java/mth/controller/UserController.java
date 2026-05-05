package mth.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;   // ✅ ADDED

import mth.models.Users;
import mth.services.UsersService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UsersService US;
    
    @PostMapping("/signup")
    public Object signup(@RequestBody Users U) {
        return US.signup(U);
    }
    
    @PostMapping("/signin")
    public Object signin(@RequestBody Map<String, Object> data)
    {
        return US.signin(data);
    }

    // ADDED METHOD
    @GetMapping("/welcomenote")
    public String welcomeNote() {
        return "Hiiiiiiii";
    }
} 