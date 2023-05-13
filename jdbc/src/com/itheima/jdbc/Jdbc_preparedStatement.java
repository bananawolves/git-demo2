package com.itheima.jdbc;

import java.sql.*;

public class Jdbc_preparedStatement {
    public static void main(String[] args) throws Exception {
       select();
    }

    private static void select() throws Exception {
        //加载mysql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "1262365852");
        //获取执行sql语句的对象
        String sql = "SELECT *FROM  users";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //执行sql语句
        ResultSet rs=preparedStatement.executeQuery();
        while (rs.next()){
            int id =rs.getInt("id");
            String name=rs.getString("name");
            String password=rs.getString("password");
            String email=rs.getString("email");
            String date=rs.getString("birthday");
            System.out.println(id+"------"+name+"------"+password+"------"+email+"------"+date);
        }

        preparedStatement.close();
        connection.close();
    }

    private static void delete() throws Exception {
        //加载mysql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "1262365852");
        //获取执行sql语句的对象
        String sql = "DELETE FROM users WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //给占位符赋值

        preparedStatement.setInt(1,5);
        //执行sql语句
        int count = preparedStatement.executeUpdate();//返回值表示的就是这个sql语句影响的行数
        System.out.println(count);

        preparedStatement.close();
        connection.close();
    }

    private static void update() throws Exception {
        //加载mysql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "1262365852");
        //获取执行sql语句的对象
        String sql = "UPDATE users SET name=?,password=?,email=?,birthday=?WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //给占位符赋值
        preparedStatement.setString(1, "itcast");
        preparedStatement.setString(2, "789");
        preparedStatement.setString(3, "itcast@itcast.cn");
        preparedStatement.setString(4, "2023-5-13");
        preparedStatement.setInt(5,5);
        //执行sql语句
        int count = preparedStatement.executeUpdate();//返回值表示的就是这个sql语句影响的行数
        System.out.println(count);

        preparedStatement.close();
        connection.close();
    }

    private static void insert() throws ClassNotFoundException, SQLException {
        //加载mysql驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "1262365852");
        //获取执行sql语句的对象
        String sql = "INSERT INTO users(name,password,email,birthday)VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //给占位符赋值
        preparedStatement.setString(1, "itheima");
        preparedStatement.setString(2, "123456");
        preparedStatement.setString(3, "itheima@itcast.cn");
        preparedStatement.setDate(4, new java.sql.Date(new Date(1).getTime()));
        //执行sql语句
        int count = preparedStatement.executeUpdate();//返回值表示的就是这个sql语句影响的行数
        System.out.println(count);
        //解析结果
        preparedStatement.close();
        connection.close();
    }
}

