package java122.api.calendar.hw_4.service;

import java122.api.calendar.hw_4.logic.CalendarLogic;
import java122.api.calendar.hw_4.logic.CalendarLogicImpl;
import org.springframework.stereotype.Service;

@Service
public class CalendarServiceImpl implements CalendarService {

    private static final CalendarLogic calendarLogic = new CalendarLogicImpl();

    @Override
    public String getCurrentTime(String languageTag) {
        return calendarLogic.getCurrentTime(languageTag);
    }
}
