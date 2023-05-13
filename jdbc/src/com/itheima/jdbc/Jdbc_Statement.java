package com.itheima.jdbc;

import java.sql.*;

public class Jdbc_Statement {
    public static void main(String[] args) throws Exception {
        select();
    }

    private static void select() throws Exception {
        //加载mysql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "1262365852");
        //获取执行sql语句的对象
        Statement stmt = conn.createStatement();
        //执行sql语句
        String sql = "SELECT*FROM USERS";
        ResultSet rs = stmt.executeQuery(sql);
        //6.解析结果
        while (rs.next()){
            int id =rs.getInt("id");
            String name=rs.getString("name");
            String password=rs.getString("password");
            String email=rs.getString("email");
            String date=rs.getString("birthday");
            System.out.println(id+"------"+name+"------"+password+"------"+email+"------"+date);
        }
        stmt.close();
        conn.close();
    }

    private static void delete() throws Exception {
        //加载mysql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "1262365852");
        //获取执行sql语句的对象
        Statement stmt = conn.createStatement();
        //执行sql语句
        String sql = "DELETE FROM users WHERE id=1";
        int count = stmt.executeUpdate(sql);//返回值表示的就是这个sql语句影响的行数
        //解析结果
        System.out.println(count);
        stmt.close();
        conn.close();
    }

    private static void update() throws Exception {
        //加载mysql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "1262365852");
        //获取执行sql语句的对象
        Statement stmt = conn.createStatement();
        //执行sql语句
        String sql = "UPDATE users SET name='itcast',password='456',email='itcast@itcsat.cn',birthday='2001-07-07'WHERE id=1";
        int count = stmt.executeUpdate(sql);//返回值表示的就是这个sql语句影响的行数
        //解析结果
        System.out.println(count);
        stmt.close();
        conn.close();
    }

    private static void insert() throws ClassNotFoundException, SQLException {
        //加载mysql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "1262365852");
        //获取执行sql语句的对象
        Statement stmt = conn.createStatement();
        //执行sql语句
        String sql = "INSERT INTO users(name,password,email,birthday)VALUES ('itheima','123456','itheima@itcast.cn','2006-06-06')";
        int count = stmt.executeUpdate(sql);//返回值表示的就是这个sql语句影响的行数
        //解析结果
        System.out.println(count);
        stmt.close();
        conn.close();
    }
}

