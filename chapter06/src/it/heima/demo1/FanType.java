package it.heima.demo1;

public class FanType {
    public static void main(String[] args) {
        InterImp i=new InterImp();
        i.show("我鼠标没电了");
    }
}

interface Inter<T>{
    public abstract void show(T t);
}
class InterImp<T> implements Inter<T>{

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
