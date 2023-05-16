package it.heima.Test4;

public class Fork {
    //初始化5个筷子的状态，都是false表示筷子没被占用
    private boolean[]used={false,false,false,false,false};
    //获取筷子
    public synchronized void takeFork(){
        //获取当前执行该方法的线程名称
        String name=Thread.currentThread().getName();
        int i=Integer.parseInt(name);
        //获取左手边的筷子
        boolean leftFork=used[i];
        //获取右手边的筷子
        boolean rightFork;
        if (i==0){
            rightFork=used[4];
        }else {
            rightFork=used[i-1];
        }
        //判断是否可以就餐
        while (leftFork||rightFork){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //设置筷子的状态
        //设置左手边的筷子状态
        used[i]=true;
        //设置右手边筷子的状态
        if (i==0){
            used[4]=true;
        }else {
            used[i-1]=true;
        }
    }
    public synchronized void putFork(){
        //获取当前执行该方法的线程名称
        String name=Thread.currentThread().getName();
        int i=Integer.parseInt(name);
        //放下左手边的筷子
        used[i]=false;
        //放下右手边的筷子
        if (i==0){
            used[4]=false;
        }else {
            used[i-1]=false;
        }
        //唤醒等待的线程
        notifyAll();
    }
}
