package java122.api.calendar.hw_4.controller;

import java122.api.calendar.hw_4.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @GetMapping("/{languageTag}")
    public String getCurrentDate(@PathVariable String languageTag) {
        return calendarService.getCurrentTime(languageTag);
    }
}
