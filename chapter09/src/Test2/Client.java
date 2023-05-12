package Test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建一个socket对象
        Socket socket=new Socket("127.0.0.1",54321);
        //写数据
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入一个字符串数据");
        String line =sc.nextLine();
        //通过打印流进行写数据
        PrintStream ps=new PrintStream(socket.getOutputStream());
        ps.println(line);
        //读取服务端的处理结果
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());
        //释放资源
        socket.close();
    }
}
