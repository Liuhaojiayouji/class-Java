package _20201125._10_3;

import java.util.Calendar;
import java.util.Date;

public class Demo12 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(
                "今天的年" +
                        year +
                        "，今天的月" +
                        month +
                        "今天的日" +
                        day);
        c.add(Calendar.DAY_OF_MONTH, 3);
        c.add(Calendar.HOUR, 5);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        System.out.println(
                "今天的日" +
                        day1 +
                        "现在的小时数" +
                        hour);
        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, 4);
        c.set(Calendar.DATE, 5);
        System.out.println(
                        "今天的年" +
                        c.get(Calendar.YEAR) +
                        "，今天的月 " +
                        c.get(Calendar.MONTH) +
                        "今天的日 " +
                        c.get(Calendar.DATE));
        Date d = c.getTime();
        System.out.println(d);
    }
}
