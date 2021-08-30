package cn.kgc.springdemo1.demo01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo01 {
    private static Connection conn;

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdb.driver");
            //1.注册驱动
//            Driver driver = new com.mysql.jdbc.Driver();
//            DriverManager.deregisterDriver(driver);
            conn = DriverManager.getConnection("jdbc:mysql:///chlm","root","root");
            System.out.println(conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) {
        System.out.println("我准备连接数据库");
//        conn = getConnection();
//        System.out.println(conn);
        System.out.println("我走了");
    }
}
