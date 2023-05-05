package Test;

import java.util.Scanner;

public class if_type2 {
    public static void main(String[] args) {
        /*需求:青蛙在超市购买商品,总价为:600元
        键盘录入一个整数表示青蛙实际支付的钱
        如果付款大于等于600,表示无事发生,否则肉偿
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择付款金额");
        int money= sc.nextInt();
        if (money>=600){
            System.out.println("付款成功,欢迎下次光临");
        }else{
            System.out.println("付款失败,肉偿");
        }
    }
}
