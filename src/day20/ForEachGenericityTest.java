package day20;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForEachGenericityTest<T> {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(10);
        list.add(new Integer(19));
        list.add(new Integer(18));
        list.add(new Integer(20));
        for (Object obj:list){
            System.out.println(obj);
        }
    }
}