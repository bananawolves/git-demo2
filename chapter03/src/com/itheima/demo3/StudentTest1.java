package com.itheima.demo3;
//如果不进行封装，有一定的隐患
public class StudentTest1 {
    public static void main(String[] args) {
        Student stu =new Student();
        /*
            stu.name="张三";
             stu.age=-23;   不合理的输出也能执行
        */
        stu.setName("张三");
        stu.setAge(-23);
        stu.show();
        String name=stu.getName();
        System.out.println(name);
    }
}
