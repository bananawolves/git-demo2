package it.heima.Test4;

public class infant extends Thread{
    private String name;
    private Fork fork;

    public infant(String name, Fork fork) {
        super(name);
        this.name = name;
        this.fork = fork;
    }

    @Override
    public void run() {
        while (true){
            //发呆
            thinking();
            //获取筷子
            fork.takeFork();
            eat();
        }
    }

    private void eat() {
        System.out.println("小朋友"+name+"在吃饭");
        try {
            sleep(1000);//模拟小朋友吃饭
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void thinking() {
        System.out.println("小朋友"+name+"在发呆");
        try {
            sleep(1000);//模拟发呆时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
