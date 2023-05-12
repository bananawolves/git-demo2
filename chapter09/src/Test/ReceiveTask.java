package Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveTask implements Runnable {
    private int receivePort;

    public ReceiveTask(int receivePort) {
        this.receivePort = receivePort;
    }

    @Override
    public void run() {
        try {
            //创建一个DatagramSocket对象
            DatagramSocket ds = new DatagramSocket(receivePort);
            //创建一个DatagramPacket对象
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            while (true){
                ds.receive(dp);
                //解析数据
                String str=new String(dp.getData(),0,dp.getLength());
                System.out.println("收到"+dp.getAddress().getHostAddress()+"---发送的数据"+str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
