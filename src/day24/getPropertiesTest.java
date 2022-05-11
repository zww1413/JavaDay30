package day24;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class getPropertiesTest {
    @Test
    public void test01(){
        String name = null;
        Object age = null;
        try {
            Properties properties = new Properties();
            ClassLoader classLoader = getPropertiesTest.class.getClassLoader();
            InputStream resourceAsStream = classLoader.getResourceAsStream("01.properties");
            //这种写法需要配置文件在当前模块的src文件夹中
            properties.load(resourceAsStream);
            name = properties.getProperty("name");
            age = properties.get("age");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        System.out.println(age);
    }
    @Test
    public void test02(){
        String name = null;
        String age = null;
        try {
            Properties properties = new Properties();
            FileInputStream fis = new FileInputStream("01.properties");
            //这种写法需要配置文件写在当前模块下
            properties.load(fis);
            name = properties.getProperty("name");
            age = properties.getProperty("age");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        System.out.println(age);
    }
}
