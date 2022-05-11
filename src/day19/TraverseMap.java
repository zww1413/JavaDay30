package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TraverseMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("语文", 95);
        map.put("数学", 99);
        map.put("英语", 91);
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
