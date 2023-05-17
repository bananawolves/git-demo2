package Test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(10001);
        while (true) {
            Socket s = serverSocket.accept();//监听客户端
            //开启线程
            new Thread(new ServerThread(s)).start();
        }
    }
}

class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //获取客户端ip地址
        String ip = socket.getInetAddress().getHostAddress();
        //定义变量记录文件个数
        int count = 1;
        try {
            //获取输入流，读取数据
            InputStream in = socket.getInputStream();
            //创建一个File对象，封装D：\\upload路径
            File parentFile = new File("D:\\upload");
            if (!parentFile.exists()) {
                parentFile.mkdir();
            }
            //创建一个File对象表示我们要存储的数据对应的文件
            File file = new File(parentFile, ip + "(" + count + ").jpg");
            while (file.exists()) {
                file = new File(parentFile, ip + "(" + count++ + ").jpg");
            }
            //创建FileOutputStream对象
            FileOutputStream fos =new FileOutputStream(file);
            //读写操作
              byte[] buf=new byte[1024];
              int len =0;
            while ((len = in.read(buf)) != -1) {
                fos.write(buf,0,len);
            }
            //给客户端进行响应
            OutputStream out =socket.getOutputStream();
            out.write("上传成功".getBytes());
            //关闭输出流对象
            fos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}