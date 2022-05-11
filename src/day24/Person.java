package day24;



public class Person {
    public String name;
    private int age;

    public void  method1(){
        System.out.println("我是通用方法一");
    }
    private  void method2(){
        System.out.println("我是私有方法二");
    }

    public Person() {
    }

    private Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
