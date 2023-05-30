import java.util.Calendar;

public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return String.valueOf(dayOfWeek);
    }
}
