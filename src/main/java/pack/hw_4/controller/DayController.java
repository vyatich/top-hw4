package pack.hw_4.controller;

import pack.hw_4.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayController {

    private final DayService dayService;

    @Autowired
    public DayController(DayService dayService) {
        this.dayService = dayService;
    }

    @GetMapping("/day")
    public String getDayByDate(){
        return dayService.getCurrentDayOfWeek("es");
    }

}
