package Test;

import java.util.Scanner;

public class switch_type3 {
    public static void main(String[] args) {
         /*需求:当我们预定机票时,出现电话提示音:
            1.机票查询
            2.机票预定
            3.机票改签
            4.退出服务
            按其他键也是退出服务
          */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int number = sc.nextInt();

        switch (number) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
