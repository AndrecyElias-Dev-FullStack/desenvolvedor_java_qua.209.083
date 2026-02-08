package com.springfont.__springfont.controlers;

import org.springframework.stereotype.Controller;

@Controller
public class SpringFrontController {
@RequestMapping("/")
public String index(){
    return "index";
}

@RequestMapping("/formulario")
public String formulario(){
    return "form";
}

}
