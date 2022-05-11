package day19;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        List list = new ArrayList(10);
        list.add(new String("中国"));
        list.add(new Integer(18));
        list.add(new Date());
        for (Object obj:list){
            System.out.println(obj);
        }
    }
}
