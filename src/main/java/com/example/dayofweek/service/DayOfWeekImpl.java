package com.example.dayofweek.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class DayOfWeekImpl implements DayOfWeek{

    @Override
    public String getDay() {
        LocalDate day = LocalDate.now();
        String dayOfWeek = String.valueOf(day.getDayOfWeek().getValue());
        return dayOfWeek;
    }

    @Override
    public String getLanguageDay() {
        Locale locale = new Locale("ru", "RU");
        LocalDate day = LocalDate.now();
        return day.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }


}
