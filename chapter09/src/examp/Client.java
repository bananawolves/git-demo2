package examp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
    new TCPClient().connect();
    }
}
class TCPClient{
    private static final int PORT =7788;
    public void connect() throws IOException {
        //创建一个socket对象
        Socket client=new Socket(InetAddress.getLocalHost(),PORT);
        //读取服务的所发送的数据
        InputStream is=client.getInputStream();
        byte[] buf=new byte[1024];
        int len=is.read(buf);
        System.out.println(new String(buf,0,len));
        //释放资源
        client.close();
    }
}
