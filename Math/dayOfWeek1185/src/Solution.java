import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;


public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return String.valueOf(dayOfWeek);
    }
}