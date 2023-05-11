package it.heima.demo;
/*继承Thread类的实现步骤:
        1、需要定义一个类，然后让这个类去继承Thread类; Thread类就是java中的线程类
        2、重写run方法创建我们定义的类的对象
        3启动线程*/
public class example {
    public static void main(String[] args) {
        //创建MyThrea类的对象
    MyThread myThread=new MyThread();

    //开启线程
        myThread.start();
        while (true){
            System.out.println("Main方法执行");
        }
    }
}
//定义了一个线程类
class MyThread extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("MyThread类中的run方法执行");
        }
    }

}
