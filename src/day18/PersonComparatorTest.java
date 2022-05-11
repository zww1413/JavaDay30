package day18;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Comparator;

public class PersonComparatorTest {

    public static void main(String[] args) {
        Person1 p1 = new Person1("zww", 18);
        Person1 p2 = new Person1("zxy", 14);
        Person1 p3 = new Person1("dyp", 19);
        Person1 []person1 = new Person1[]{p1,p2,p3};
        Arrays.sort(person1,new Comparator(){
            public int compare(Object o1,Object o2){
                    if (o1 instanceof Person1 && o2 instanceof Person1){
                        Person1 p1 = (Person1) o1;
                        Person1 p2 = (Person1) o2;

                        return -Double.compare(p1.getAge(),p2.getAge());
                    }
                    throw new RuntimeException("输入的数据类型有误");
            }

        });
        for( int i = 0;i < person1.length; i++) {
            System.out.println(person1[i].toString());
        }
    }
}

class Person1 {
    private  String name;
    private  double  age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public double getAge() {
        return age;
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}