package com.example.weekdayservice.controller;

import com.example.weekdayservice.entity.WeekDay;
import com.example.weekdayservice.service.WeekDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeekDayController {
    private final WeekDayService weekDayService;

   @Autowired
    public WeekDayController(WeekDayService weekDayService) {
       this.weekDayService = weekDayService;
    }

    @GetMapping("/weekDay")
    public WeekDay getWeekDay(WeekDay weekDay) {
        return weekDayService.getWeekDay(weekDay);
    }
}
