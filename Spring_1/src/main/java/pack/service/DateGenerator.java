package pack.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class DateGenerator {
    public Locale locale;

    public void setLocale(String language){
        if (language.equals("RU")){
            locale = new Locale("RU");
        } else if (language.equals("DE")) {
            locale = new Locale("DE");
        } else if (language.equals("DK")) {
            locale = new Locale("DK");
        } else if (language.equals("IT")) {
            locale = new Locale("IT");
        } else if (language.equals("CH")) {
            locale = new Locale("CHINA");
        } else if (language.equals("JP")) {
            locale = new Locale("JP");
        }
    }

    public String dateGeneratorNow(String language){
        setLocale(language);
        int dayOfMonth = OffsetDateTime.now().getDayOfMonth();
        int year = OffsetDateTime.now().getYear();
        String month = OffsetDateTime.now().getMonth().getDisplayName(TextStyle.FULL, locale);
        String dayOfWeek = OffsetDateTime.now().getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
        return dayOfMonth + " " + month + " " + year + " " + dayOfWeek;
    }
}
