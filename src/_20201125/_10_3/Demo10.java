package _20201125._10_3;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Demo10 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        DateFormat shortFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        System.out.println(dateFormat.format(date));
        System.out.println(fullFormat.format(date));
        System.out.println(longFormat.format(date));
        System.out.println(shortFormat.format(date));
        System.out.println(mediumFormat.format(date));
        String str = "2017年10月3日";
        Date data1 = longFormat.parse(str);
        System.out.println(data1);
    }
}