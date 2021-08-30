package cn.kgc.springdemo1.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {

    private static Properties properties = new Properties();
    private static InputStream is;
    static {
        is = BeanFactory.class.getClassLoader().getResourceAsStream("person.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object getPerson(String name){
        String personStr = null;
        Object person = null;
        try {
            personStr = properties.getProperty(name);
         //   System.out.println(personStr);
            person = Class.forName(personStr).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }
}
