package day17;
//练习一：字符串"2020-09-08"转换为java.sql.Date
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StingToSqlDate {
    public static void main(String[] args) throws ParseException {
        String str = new String("2020-09-08");
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = spf.parse(str);
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }
}
