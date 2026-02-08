package com.helloworld.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellloWorldController {
@RequestMapping("/")
public String index(){
    return "index";
}
}
