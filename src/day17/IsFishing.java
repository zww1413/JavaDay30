package day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IsFishing {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入时间判断打渔还是晒网");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = spf.parse(str);
        int day = (int)((date.getTime() % (24 * 3600 * 1000)+1) % 5);
        if( day == 1 || day == 2 || day == 3 ) {
            System.out.println("打渔");
        }
        else if( day == 0 || day == 4 ){
            System.out.println("晒网");
        }
    }
}
