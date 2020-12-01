
package _20201125._10_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo11 {
    public static void main(String[] args) throws Exception {
        Date date = new Date(1607616000000L);
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(date);
        System.out.println(str);
        String str1="2020年12月11日";
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = df1.parse(str);
        System.out.println(date1);
        SimpleDateFormat df2 = new SimpleDateFormat("YYYY年MM月dd日:今天是yyyy年的第D天,E");
        System.out.println(df2.format(new Date()));

    }
}