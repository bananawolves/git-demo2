package it.heima.demo1;

import java.util.TreeSet;
/*
排序方式一：自然排序。要求集合中元素的类必须要实现comparable接口，重写compareto编写比较条件
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("aa", 25);
        Student s2 = new Student("ba", 23);
        Student s3 = new Student("aa", 25);
        Student s4 = new Student("bb", 23);
        Student s5 = new Student("cc", 24);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student student : ts) {
            System.out.println(student);
        }
    }
}
