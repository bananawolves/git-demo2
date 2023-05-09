package it.heima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static ArrayList<Phone> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        list.add(new Phone("小米手机", "黑色", 1999, 20));
        list.add(new Phone("华为手机", "黑色", 2999, 30));
        System.out.println("欢迎来到商品故库存管理系统，请输入您的选择：");
        while (true) {
            System.out.println("1.商品入库");
            System.out.println("2.商品显示");
            System.out.println("3.删除商品");
            System.out.println("4.推出系统");
            int choice = sc.nextInt();
            if (choice == 1) {
                add();
                show();
            } else if (choice == 2) {
                show();
            } else if (choice == 3) {
                delete();
                show();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("您输入有误");
            }
        }
    }

    private static void delete() {
        System.out.println("请输入要删除的第几个商品：");
        int i=sc.nextInt();
        list.remove(i-1);
        System.out.println("删除成功");
    }

    private static void show() {
        if (list.size() == 0) {
            System.out.println("目前暂时没有商品可以查看");
        } else {
            System.out.println("目前的现有的商品为：");
            for (Phone phone : list) {
                System.out.println(phone);
            }
        }
    }

    private static void add() {
        System.out.println("确认要录入数据吗？");
        String choice = sc.next();
        if ("yes".equals(choice)) {
            System.out.println("请输入商品的名称");
            String name = sc.next();
            System.out.println("请输入商品的颜色");
            String color = sc.next();
            System.out.println("请输入商品的价格");
            int price = sc.nextInt();
            System.out.println("请输入商品的数量");
            int num = sc.nextInt();
            Phone p = new Phone(name, color, price, num);
            list.add(p);
            System.out.println("添加成功");
        } else {
            return;
        }
    }
}
