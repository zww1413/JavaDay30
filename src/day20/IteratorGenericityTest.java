package day20;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IteratorGenericityTest<T> {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>(10);
        list.add(new String("中国"));
        list.add(new String("美国"));
        list.add(new String("日本"));
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
