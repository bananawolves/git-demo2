package it.heima.demo1;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    /*
        编写排序规则
            返回值特点：
            1.返回的是负数，向左存
            2.返回的是0，不存储
            3.返回的是整数，向右存
     */
    public int compareTo(Student o) {
        //排序规则：年龄升序
        int result = this.age - o.getAge();
        //次要条件：如果年龄相同。按照姓名排序
        if (result==0){
            result=this.name.compareTo(o.getName());
        }
        return result;
    }
}
