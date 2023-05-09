package it.heima.test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        w:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1.查看学生");
            System.out.println("2.添加学生");
            System.out.println("3.修改学生");
            System.out.println("4.删除学生");
            System.out.println("5.退出系统");
            System.out.println("请输入您的选择");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    select(list);
                    break;
                case 2:
                    add(list);
                    break;
                case 3:
                    update(list);
                    break;
                case 4:
                    delete(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用");
                    break w;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }

    private static void delete(ArrayList<Student> list) {
        System.out.println("请输入要删除的学号;");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                list.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("您输入的学号不存在");
    }

    private static void update(ArrayList<Student> list) {
        System.out.println("请输入要修改的学生学号：");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                System.out.println("请输入要修改的姓名");
                String name = sc.next();
                System.out.println("请输入要修改的年龄");
                int age = sc.nextInt();
                System.out.println("请输入要修改的地址");
                String address = sc.next();
                stu.setId(id);
                stu.setName(name);
                stu.setAge(age);
                stu.setAddress(address);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("您输入学号不存在");
    }

    private static void add(ArrayList<Student> list) {
        String id;
        while (true) {
            System.out.println("请输入学号");
            id = sc.next();
            boolean flag = false;
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                if (stu.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("学号已经存在，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的地址：");
        String address = sc.next();
        Student s = new Student(id, name, age, address);
        list.add(s);
        System.out.println("添加成功");
    }

    private static void select(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前没有任何数据");
        } else {
            System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t\t\t" + stu.getName() + "\t\t\t" + stu.getAge() + "\t\t\t" + stu.getAddress());

            }
        }
    }
}
