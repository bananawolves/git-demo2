package Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendTask implements Runnable {
    private int sendPort;

    public SendTask(int sendPort) {
        this.sendPort = sendPort;
    }

    @Override
    public void run() {
        try {
            //创建一个DatagramSocket对象
            DatagramSocket ds=new DatagramSocket();
            //键盘录入数据
            Scanner sc=new Scanner(System.in);
            while (true){
                //接受键盘录入数据
                String data=sc.nextLine();
                byte[] buf =data.getBytes();
                DatagramPacket dp=new DatagramPacket(buf,buf.length, InetAddress.getByName("localhost"),sendPort);
                //发送数据
                ds.send(dp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
