package Test;

import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        System.out.println("欢迎使用微信");
        Scanner sc=new Scanner(System.in);
        //录入您的微信号
        System.out.println("请录入您的微信号");
        int receivePort=sc.nextInt();
        //录入好友的微信号
        System.out.println("请录入好友的微信号");
        int sendPort=sc.nextInt();
        //开启线程
        new Thread(new ReceiveTask(receivePort)).start();
        new Thread(new SendTask(sendPort)).start();

    }
}
