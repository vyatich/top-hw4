package com.hw4.restful.service;

import com.hw4.restful.entity.Day;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class DayServiceImpl implements DayService {
    //Подставить нужный язык.
    private final String LANGUAGE = "de";
    private final String COUNTRY = "DE";

    @Override
    public Day getDay(Day date) {
        Locale locale = new Locale(LANGUAGE, COUNTRY);
        date.setDate(DayOfWeek.from(LocalDate.now())
                     .getDisplayName(TextStyle.FULL, locale));

        return date;
    }
}
