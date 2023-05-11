package it.heima.Test;

public class ticket {
    public static void main(String[] args) {

        new TicketWindow("窗口一").start();
        new TicketWindow("窗口二").start();
        new TicketWindow("窗口三").start();
        new TicketWindow("窗口四").start();
    }
}
class TicketWindow extends  Thread{
    private static int tickets=100;

    public TicketWindow(String name) {
        super(name);
    }
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
