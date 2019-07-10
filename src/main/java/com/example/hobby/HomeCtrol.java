package com.example.hobby;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrol {
    @RequestMapping("/home")
    public String homePage(){
        return ("home");
    }

    @RequestMapping("/photo")
    public String infoPage(){
        return ("photo");
    }

    @RequestMapping("/calendar")
    public String calendarPage(){
        return ("calendar");
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return ("about");
    }

    @RequestMapping("/info")
    public String photo1Page(){
        return ("info");
    }

}
