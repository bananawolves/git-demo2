package examp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        new TCPSever().listen();
    }
}

class TCPSever {
    private static final int PORT = 7788;

    public void listen() throws IOException {
        //创建一个SeverSocket对象
        ServerSocket serverSocket = new ServerSocket(PORT);
        while (true) {
            //调用accept方法，监听客户端
            Socket client = serverSocket.accept();
            new Thread() {
                @Override
                public void run() {
                    try {
                        //获取输出流
                        OutputStream os = client.getOutputStream();
                        System.out.println("开始与客户端交互数据");
                        os.write("传智播客欢迎您！".getBytes());
                        Thread.sleep(5000);
                        System.out.println("结束与客户端交互数据");
                        //释放资源
                        os.close();
                        client.close();
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }.start();
        }
    }
}
