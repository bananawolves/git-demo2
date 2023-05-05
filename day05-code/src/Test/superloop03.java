package Test;

import java.util.Scanner;

public class superloop03 {
    public static void main(String[] args) {
        //要求:键盘录入一个正整数,判断他是不是一个质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        boolean flag =true;
        int num = sc.nextInt();
        for (int i = 2; i < num; i++){
            if (num%i==0){
                flag=false;
//                System.out.println(num+"不是一个质数");
                break;
            }
            /*else if (i==num-1){
                 System.out.println(num+"是一个质数");
            }*/
        }
        if (flag){
            System.out.println(num+"是一个质数");
        }else System.out.println(num+"不是一个质数");
    }
}
