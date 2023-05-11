package it.heima.Test3;

public class Svip {
    public static void main(String[] args) {
        Thread t=new Normal();
        t.start();
    }

}
class Normal extends Thread{
    @Override
    public void run() {
        System.out.println("业务办理窗口正在排队中");
        System.out.println("此时来了一个svip客户");
        Thread t=new Special();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("业务办理窗口恢复正常排队");
    }
}
class Special extends Thread{
    @Override
    public void run() {
        System.out.println("svip客户办理业务中");
        System.out.println("svip客户办理业务倒计时");
        for (int i = 10; i >=0 ; i--) {
            System.out.println(i+"秒");
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("svip客户办理完毕");
    }
}
