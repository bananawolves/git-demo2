package com.itheima.demo1;

public class finalTest {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
        final int NUM = 10;//自定义常量: 单词全部大写，如果多个单词，单词之间使用下划线分割
        final Fu f = new Fu();
        f.setName("张三");
        f.setName("李四");
        // final 修饰引用类型变量，指的是内存地址不能发生改变。但是内部属性值是可以修改的
        //f =new Fu();
    }
}
    class Fu{
        private String  name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public final void show(){
            System.out.println("fu....show.....");
        }
    }
    class Zi extends Fu{

    }


