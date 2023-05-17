package Test3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
    public static void main(String[] args) throws IOException {
        //创建客户端的socket对象
        Socket socket=new Socket("127.0.0.1",10001);
        //获取输出流对象
        OutputStream out=socket.getOutputStream();
        //键盘录入一个文件路径
        System.out.println("请输入你要上传的文件路径");
        Scanner sc=new Scanner(System.in);
        String upload=sc.nextLine();
        if (!upload.isEmpty()){
            //创建一个FileInputStream对象
            FileInputStream fis=new FileInputStream(upload);
            //进行数据读写
            byte[]buf=new byte[1024];
            int len=0;
            while ((len=fis.read(buf))!=-1){
                out.write(buf,0,len);
            }
            //关闭输出流
            socket.shutdownOutput();
            //获取输入流对象
            InputStream in=socket.getInputStream();
            byte[] bufMsg=new byte[1024];
            int num=in.read(bufMsg);
            String msg=new String(bufMsg,0,num);
            System.out.println(msg);
            //资源释放
            fis.close();
            socket.close();
        }else {
            System.out.println("请输入文件路径后再上传");
        }
    }
}
