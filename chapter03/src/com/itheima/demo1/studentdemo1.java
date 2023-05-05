package com.itheima.demo1;
/* 创建对象格式：类名 对象名=new 类名（）
    使用成员变量：对象名.成员变量名
    使用成员方法：对象名.成员方法名
 */
public class studentdemo1 {
    public static void main(String[] args) {
        //创建student学生对象
        student stu=new student();
        //System.out.println(stu);//com.itheima.student@41629346
        //    使用成员变量：对象名.成员变量名
        stu.name="张三";
        stu.age=23;
        stu.sex="男";
        //     使用成员方法：对象名.成员方法名
        stu.read();
        System.out.println("-----------------------");
        //创建第二个对象
        student stu2=new student();
        stu2.name="李三";
        stu2.age=33;
        stu2.sex="女";
        stu2.read();
    }
}
