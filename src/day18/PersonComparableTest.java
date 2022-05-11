package day18;

import java.lang.annotation.Retention;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class PersonComparableTest {
    public static void main(String[] args) {
        Person p1 = new Person("zww", 18);
        Person p2 = new Person("zxy", 14);
        Person p3 = new Person("dyp", 19);
        Person []person =new Person[]{p1,p2,p3};
        //if(p1.compareTo(p2) < 0) {
        //    System.out.println("p1名字在p2前面");
        //}
        //else
        //    System.out.println("p1名字在p2后面");
        //if(p1.compareTo(p3) < 0) {
        //    System.out.println("p1名字在p3前面");
        //}
        //else
        //    System.out.println("p1名字在p3前面");
        Arrays.sort(person);
        for( int i = 0;i < person.length; i++) {
            System.out.println(person[i].toString());
        }

    }
}

class Person implements Comparable{
    private String name;
    private  int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int compareTo(Object o){
        if (o instanceof Person){
            Person person = (Person) o;
            return this.name.compareTo(person.name);
        }
        else
            throw  new RuntimeException("输入的数据类型有误");
    }
}