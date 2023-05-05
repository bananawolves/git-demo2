package com.itheima;
//有返回值的方法
public class methodDemo2 {
    public static void main(String[] args) {
        int area=S(5,3);
        System.out.println(area);
    }
    public static  int S(int x,int y){
        int area=x*y;
        return area;
    }
}
