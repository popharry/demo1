package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2018-11-22 15:51
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String index(Model model){
        String str = "小明";
        model.addAttribute("str",str);
        return "/index";
    }
}
