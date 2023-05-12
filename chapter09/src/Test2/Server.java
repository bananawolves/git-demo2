package Test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建一个ServerSocket对象
        ServerSocket server=new ServerSocket(54321);
        System.out.println("服务器启动了，绑定的端口号为：54321");
        while (true){
            //监听客户端
            Socket socket=server.accept();
            new Thread(){
                @Override
                public void run() {
                    try {
                        //读取客户端所发送过来的数据
                        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String line=br.readLine();
                        String result=new StringBuilder(line).reverse().toString();
                        //创建一个PrintStream对象
                        PrintStream ps=new PrintStream(socket.getOutputStream());
                        ps.println(result);
                        //释放资源
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
