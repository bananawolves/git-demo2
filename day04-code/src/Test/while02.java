package Test;

import java.util.Scanner;

public class while02 {
    public static void main(String[] args) {
        //需求:键盘录入一个数,判断是不是回文数(即:正序和倒序读都是一样的整数,如121)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        //使用一个临时值来记录,方便最后比较
        int temp = x;
        int num=0;
        while(x!=0){
            //获取个位数
            int ge =x%10;
            //去除个位数方便拼接
            x=x/10;
            num=num*10+ge;
        }
        System.out.println(num);
        System.out.println(num==temp);

    }
}
