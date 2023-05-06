package com.itheima.salary;

public class Graduate implements studentMangeInterface,teacherMangeInterface{
    private String name;
    private String sex;
    private int age;
    private double pay;
    private double fee ;

    public Graduate(String name, String sex, int age, double pay, double fee) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.pay = pay;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getPay() {
        return pay;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public void setFree(double fee) {

    }

    @Override
    public double getFree() {
        return 0;
    }
}
