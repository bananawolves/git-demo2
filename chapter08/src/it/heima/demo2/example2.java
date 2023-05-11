package it.heima.demo2;
/*开发步骤:
        1、定义一个类，然后这个类去实现Runnable接口。Runnable接口就是一任务接口，在该接口中定义了一个方法，就是run，这个方法就是用来封装要被线程所执行的代码
        2、重写run方法
        3.创建Thread对象，在创建这个对象之前我们需要先创建任务类对象，然后把任务类对象作为Thread的构造方法参数传递过去
        4、启动线程*/
public class example2 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);
        thread.start();
        while (true){
            System.out.println("Main方法被执行了");
        }
    }

}
class MyThread implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("MyThread类中的run方法执行");
        }
    }
}
