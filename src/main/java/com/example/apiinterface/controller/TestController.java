package com.example.apiinterface.controller;

import com.example.apiinterface.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("name")
public class TestController {

    @GetMapping("/")
    public String getNameByGet(String name){
        return "get "+name;
    }
    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return "post "+name;
    }
    @PostMapping("/User")
    public String getNameByPosts(@RequestBody User user){
        return "post__ "+user.UserName;
    }

}
