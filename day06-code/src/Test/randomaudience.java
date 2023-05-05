package Test;

import java.util.Random;
import java.util.Scanner;

//抽取幸运观众
public class randomaudience {
    public static void main(String[] args) {
        String[] arr = new String[3];
    //1.键盘输入三个观众姓名
        save(arr);
        //2.展示所有的姓名
        show(arr);
        //随机抽取一个姓名进行展示
        randomName(arr);
    }

    private static void randomName(String [] arr) {
        Random r=new Random();
        int index=r.nextInt(arr.length);
        System.out.println("幸运观众是："+arr[index]);
    }

    private static void show(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"个观众的姓名是："+arr[i]);
        }
    }

    private static void save(String[] arr) {
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个观众的姓名：");
            arr[i]=sc.next();
        }
    }
}
