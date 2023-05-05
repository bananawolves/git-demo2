package Test;

import java.util.Scanner;

public class if_type3 {
    public static void main(String[] args) {
        /*根据不同的分数送不同的礼物给小明
        95-100,送一辆自行车
        90-94,游乐场畅玩一天
        80-89,送变形金刚一个
        小于80,送好吃的七匹狼
         */
        //1.键入小明的成绩
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明本次考试的成绩");
        int marks= sc.nextInt();
        //2.判断小明会获得什么样的奖励
        if (marks>=0&&marks<=100){
            if (marks>=95){
                System.out.println("奖励一辆自行车");
            }else if(marks>=90&&marks<95){
                System.out.println("奖励游乐场畅玩一天");
            }else if(marks>=80&&marks<90){
                System.out.println("奖励变形金刚一套");
            }else{
                System.out.println("奖励一顿好吃的七匹狼");
            }
        }else{
            System.out.println("输入格式有误,请重新输入成绩");
        }
    }
}
