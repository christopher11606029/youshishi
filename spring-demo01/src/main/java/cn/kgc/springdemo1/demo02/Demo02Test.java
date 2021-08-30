package cn.kgc.springdemo1.demo02;

public class Demo02Test {
    public static void main(String[] args) {
        System.out.println("你好，欢迎光临");

        UserDao person = (UserDao) BeanFactory.getPerson("userDaoImpl1");
//        person.showInfo();
//        System.out.println("再见");
        UserDao person1 = (UserDao) BeanFactory.getPerson("userDaoImpl1");
        System.out.println(person1 == person);
    }
}
