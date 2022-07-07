package com.example.dayofweek.controller;

import com.example.dayofweek.service.DayOfWeek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayOfWeekController {
    private final DayOfWeek dayOfWeek;

    @Autowired
    public DayOfWeekController(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

//    @RequestMapping("/day")
//    public String getDay() {
//        return dayOfWeek.getDay();
//    }

    @RequestMapping("/day")
    public String getLanguageDay() {
        return dayOfWeek.getLanguageDay();
    }

}
