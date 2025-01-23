package day12;

import java.util.Calendar;

public class WeekMain {
    public static void main(String[] args) {
        Week today = null;

        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        //일, 요일, 시간, 분,초
        int month = now.get(Calendar.MONTH) +1;
        int day = now.get(Calendar.DAY_OF_WEEK);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
    }
}
