package Test;

import java.util.Scanner;

public class switch_type2 {
    public static void main(String[] args) {
        /*需求:键盘录入星期数,输出工作日,休息日
            (1-5)为工作日,(6-7)为休息日
        */

        //1.键盘录入星期数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入今天是星期几");
        int day=sc.nextInt();

        //2.用switch语句进行判断
        /*switch (day){
            case 1 -> System.out.println("星期一是工作日");
            case 2 -> System.out.println("星期二是工作日");
            case 3 -> System.out.println("星期三是工作日");
            case 4 -> System.out.println("星期四是工作日");
            case 5 -> System.out.println("星期五是工作日");
            case 6 -> System.out.println("星期六是休息日");
            case 7 -> System.out.println("星期日是休息日");
            default ->System.out.println("您输入的格式不对");
       }
       //3.利用case穿透来简化代码,并且相同的输出可以合并
       */
        switch (day){
            case 1,2,3,4,5->System.out.println("工作日");
            case 6,7->System.out.println("休息日");
            default ->System.out.println("您输入的格式不对");
        }

    }
}
