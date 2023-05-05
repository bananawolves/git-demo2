package Test;

public class while03 {
    public static void main(String[] args) {
        /*需求":给定两个整数,被除数和除数(都是正数,且不超过int范围)将两数相除
        要求不适用/  *和%得到商和余数
         */
        /*分析 给定a=100,b=11;
                100-11=89;
                89-11=78;
                .........
                12-11=1
         */
        int a = 100;
        int b = 11;
        int count=0;
        while (a>=b){
            a=a-b;
            count++;
        }
        System.out.println("商是"+count);
        System.out.println("余数是"+a);
    }
}
