package com.hw4.restful.controller;

import com.hw4.restful.entity.Day;
import com.hw4.restful.service.DayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DayController {

    private final DayService dayService;

    public DayController(DayService dayService) {
        this.dayService = dayService;
    }

    @RequestMapping("/day")
    public Day getDay() {
        return dayService.getDay();
    }
}
