package com.hw4.restful.controller;

import com.hw4.restful.entity.Day;
import com.hw4.restful.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DayController {

    private final DayService dayService;
    
    @Autowired
    public DayController(DayService dayService) {
        this.dayService = dayService;
    }

    @RequestMapping("/day")
    public Day getDay(Day day) {
        return dayService.getDay(day);
    }
}
