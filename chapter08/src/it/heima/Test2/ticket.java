package it.heima.Test2;

public class ticket {
    public static void main(String[] args) {
    TicketWindow tw=new TicketWindow();
        new Thread(tw,"窗口一").start();
        new Thread(tw,"窗口二").start();
        new Thread(tw,"窗口三").start();
        new Thread(tw,"窗口四").start();

    }
}
class TicketWindow implements Runnable{
    private  int tickets=100;

    public void run(){
        while (true){//模拟一直有票
            if (tickets>0){
                //获取当前正在执行的对象
                Thread th=Thread.currentThread();
                String th_name=th.getName();
                System.out.println(th_name+"正在发售第"+tickets--+"张票");
            }
        }
    }
}
