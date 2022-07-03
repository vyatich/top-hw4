package java122.api.calendar.hw_4.logic;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class CalendarLogicImpl implements CalendarLogic {

    @Override
    public String getCurrentTime(String languageTag) {
        Locale locale = Locale.forLanguageTag(languageTag);
        return LocalDateTime.now()
                .format(DateTimeFormatter
                        .ofLocalizedDateTime(FormatStyle.FULL)
                        .withLocale(locale)
                        .withZone(ZoneId.systemDefault()));
    }
}
