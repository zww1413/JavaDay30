package day24;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getClassStructure {
    @Test
    public void getClassFields()  {
        try {
            Class<Person> getClassStructureClass = Person.class;
            Person person1 = getClassStructureClass.newInstance();

            Field name = getClassStructureClass.getDeclaredField("name");

            Field age = getClassStructureClass.getDeclaredField("age");
            age.setAccessible(true);

            System.out.println(person1.toString());

            name.set(person1, "zww");
            age.set(person1,18);

            System.out.println(person1.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getClassMethods(){
        try {
            Person person2 = new Person();
            Class person2Class = person2.getClass();
            Method methods1 = person2Class.getDeclaredMethod("method1");
            methods1.invoke(person2);
            Method method2 = person2Class.getDeclaredMethod("method2");
            method2.setAccessible(true);
            method2.invoke(person2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //for(Method method:methods1){
        //    System.out.println(method);
        //}可查看该类的所有方法



    }
    @Test
    //有错误，后续更改查找
    public  void getClassConstructors(){
        try {
            Class<?> class3 = Class.forName("day24.Person");
            Object person3 = class3.newInstance();
            Constructor<?> declaredConstructor = class3.getDeclaredConstructor(String.class, Integer.class);
            //构造器参数只有参数列表，无需构造器名
            declaredConstructor.setAccessible(true);
            declaredConstructor.newInstance(person3);
            System.out.println(person3.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
