package com.itheima.test3;

/*(1)通过任务描述可知，需要定义一个手机类Phone 实现手机的概念。“
(2)手机具有属性:品牌 (brand)、型号 (type)、价格(price)、操作系统(os)和内存(memory)。
因此，需要在手机类中定义品牌(brand)、型号(type)、价格(price)、操作系统(os)和内存(memory)的变量。“
(3)手机具有功能:查看手机信息 (about ())、打电话 (call (String no))、玩游戏(playGame0)、下载音乐(downloadMusic0)、播放音乐(playMusic0)。
        所以，可以定义对应的方法 about ()、call ()、playGame0)、downloadMusic0、playMusic0)。
 */
public class Phone {
    private String brand;
    private String type;
    private double price;
    private String os;
    private int memory;

    public Phone() {
    }

    public Phone(String brand, String type, double price, String os, int memory) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.os = os;
        this.memory = memory;
    }
    public void about(){
        System.out.println("手机的品牌是："+brand);
        System.out.println("手机的型号是："+type);
        System.out.println("手机的价格是："+price);
        System.out.println("手机的操作系统是："+os);
        System.out.println("手机的内存是："+memory);
    }
    public void call(int num){
        System.out.println("使用自动拨号功能......");
        switch (num){
            case 1-> System.out.println("给爸爸打电话");
            case 2-> System.out.println("给妈妈打电话");
            case 3-> System.out.println("给爷爷打电话");
            case 4-> System.out.println("给奶奶打电话");

        }
    }
    public void playGame(){
        System.out.println("玩扫雷游戏");
    }
    public void downLoadMusic(String name){
        System.out.println("下载音乐："+name);
    }
    public void playMusic(String name){
        System.out.println("播放音乐："+name);
    }
}
