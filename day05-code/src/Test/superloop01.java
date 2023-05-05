package Test;

public class superloop01 {
    public static void main(String[] args) {
        /*要求:从任意一个数字开始报数,当你要报的数字是包含7或者是7的倍数时都要说过
        打印出从1-100之间的满足逢7过规则的数据
        */
        //1.代码形式1
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7) {
                System.out.println("大声说:过");
                continue;
            }
            System.out.println("报数:" + i);
        }
        //代码形式2.
        /*for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7) {
                System.out.println("大声说:过");
            }else System.out.println("报数:"+i);
        }*/
    }
}
