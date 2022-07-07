package com.example.weekdayservice.service;

import com.example.weekdayservice.entity.WeekDay;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class WeekDayServiceImpl implements WeekDayService{
    @Override
    public WeekDay getWeekDay(WeekDay weekDay) {
        String LANGUAGE = "fr";
        String COUNTRY = "FR";
        Locale locale = new Locale(LANGUAGE, COUNTRY);
        weekDay.setWeekDay(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, locale));
        return weekDay;
    }
}
