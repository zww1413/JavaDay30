package day20;

import javax.xml.soap.Node;
import java.util.*;

public class TraverseMapGenericity {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>(10);
        hashMap.put("语文", 95);
        hashMap.put("数学", 99);
        hashMap.put("英语", 91);

        Set<String> key = hashMap.keySet();
        for(String k:key){
            System.out.println(k);
        }

        Collection<Integer> value = hashMap.values();
        for(Integer v:value){
            System.out.println(v);
        }

        Iterator<Map.Entry<String,Integer>> iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
            //或者使用System.out.println(entry);
        }
    }
}
