package com.itheima;
//无返回值的方法
public class methodDemo1 {
    public static void main(String[] args) {
        printrectangle(5,3);
        System.out.println("----------------------");
        printrectangle(3,5);
    }
    public static void printrectangle(int height,int weight){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return ;
    }
}
