package pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.service.DateGenerator;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
@RequestMapping("date/")
public class DateController {
    private final DateGenerator dateGenerator = new DateGenerator();




    @GetMapping("now/ru/")
    public String getDateRu(){
        return dateGenerator.dateGeneratorNow("RU");
    }

    @GetMapping("now/de/")
    public String getDateDe(){
        return dateGenerator.dateGeneratorNow("DE");
    }

    @GetMapping("now/dk/")
    public String getDateDk(){
        return dateGenerator.dateGeneratorNow("DK");
    }

    @GetMapping("now/it/")
    public String getDateIt(){
        return dateGenerator.dateGeneratorNow("IT");
    }

    @GetMapping("now/ch/")
    public String getDateCh(){
        return dateGenerator.dateGeneratorNow("CH");
    }

    @GetMapping("now/jp/")
    public String getDateJp(){
        return dateGenerator.dateGeneratorNow("JP");
    }

}
