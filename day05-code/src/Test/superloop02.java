package Test;

import java.util.Scanner;

public class superloop02 {
    public static void main(String[] args) {
        /*要求:键盘录入一个大于等于2的整数x,计算并返回x的平方根,
        结果只保留整数部分

        分析:20的平方根
        1*1=1<20
        2*2=4<20
        3*3=9<20
        4*4=16<20
        5*5=25>20
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        int num= sc.nextInt();
        if (num>=2) {
            int i = 2;
            while (i * i <= num) {
                i++;
            }
            System.out.println("该整数的平方根时:"+(i-1));
        }else System.out.println("输入无效");
    }
}
