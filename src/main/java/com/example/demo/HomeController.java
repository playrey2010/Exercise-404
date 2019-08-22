package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String courses() {
        return "courses";
    }

    @RequestMapping("/teacher")
    public String teacherPage() {
        return "teacher";
    }

    @RequestMapping("/student")
    public String studentPage() {
        return "student";
    }
}
