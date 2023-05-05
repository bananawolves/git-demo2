package Test;

import java.util.Scanner;

public class if_type1 {
    public static void main(String[] args) {
        //小红:如果你考试得了第一名,我就给你爽一下

        //1.键盘录入小明的名次
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明的名次");
        int rank= sc.nextInt();
        //2.判断小明能不能爽
        if (rank==1){
            System.out.println("今晚小红是属于小明的");
        }
    }
}
