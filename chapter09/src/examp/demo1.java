package examp;

import java.io.IOException;
import java.net.InetAddress;

public class demo1 {
    public static void main(String[] args) throws IOException {
        // 获取本机所表示的InetAddress对象
        InetAddress localAdress = InetAddress.getLocalHost();
        // 获取www.itcast.cn这个主机所表示的InetAddress对象
        InetAddress remoteAddress = InetAddress.getByName("www.itcast.cn");
// 调用成员方法，获取其他信息
        System.out.println("本机的ip地址:" + localAdress.getHostAddress());
        System.out.println("itcase的ip地址:" + remoteAddress.getHostAddress());
        System.out.println("3秒是否可达:" + remoteAddress.isReachable(3000));
        System.out.println("itcast的主机名:"  + remoteAddress.getHostName ());
        System.out.println("本机的计算机名:"  + localAdress.getHostName ());
    }
}
