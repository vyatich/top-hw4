package pack.hw_4.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class DayServiceImpl implements DayService {

    @Override
    public String getCurrentDayOfWeek(String language) {
        Locale locale = Locale.forLanguageTag(language);
        return LocalDateTime.now().getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }
}
