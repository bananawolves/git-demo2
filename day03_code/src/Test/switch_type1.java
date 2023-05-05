package Test;

import java.util.Scanner;

public class switch_type1 {
    public static void main(String[] args) {
        /*键盘录入星期数,显示今天的减肥活动
        星期一:跑步
        星期二:游泳
        星期三:慢走
        星期四:动感单车
        星期五:拳击
        星期六:爬山
        星期日:奖励一顿大餐
         */
        //1.键盘录入星期数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入今天是星期几");
        int date= sc.nextInt();
        //2.判断今天的活动
        switch (date){
            case 1:
                System.out.println("running");
                break;
            case 2:
                System.out.println("swimming");
                break;
            case 3:
                System.out.println("jogging");
                break;
            case 4:
                System.out.println("bicycling");
                break;
            case 5:
                System.out.println("boxing");
                break;
            case 6:
                System.out.println("climbing");
                break;
            case 7:
                System.out.println("eating");
                break;
        }
    }
}
