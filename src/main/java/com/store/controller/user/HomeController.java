package com.store.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "HomeOfUser")
@RequestMapping("/user")
public class HomeController {

    @GetMapping("/home")
    public ModelAndView showHone(){
        ModelAndView mav = new ModelAndView("user/home");
        return mav;
    }
}
