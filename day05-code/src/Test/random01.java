package Test;

import java.util.Random;
import java.util.Scanner;

public class random01 {
    public static void main(String[] args) {
        //程序自动生成一个1-100之间的随机数字,使用程序实现猜字谜游戏
        Random r=new Random();
        int num= r.nextInt(100)+1;
        int i=0;
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一个整数");
            int guessNumber=sc.nextInt();
            if (guessNumber<num){
                System.out.println("小了");
            }else if (guessNumber>num){
                System.out.println("大了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
