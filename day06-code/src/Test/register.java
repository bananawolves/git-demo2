package Test;

import java.util.Scanner;

//登录注册
public class register {
    static String[] arr1 = new String[3];
    static String[] arr2 = new String[3];
    static Scanner sc = new Scanner(System.in);//在主函数之前声明，方便所有方法的使用

    public static void main(String[] args) {
        //保存测试的数据
        arr1[0] = "张三";
        arr2[0] = "123";
        while (true) {
            System.out.println("-------黑马系统-------");
            System.out.println("1.查看功能");
            System.out.println("2.登录功能");
            System.out.println("3.注册功能");
            System.out.println("4.推出系统");
            int id = sc.nextInt();
            switch (id) {
                case 1:
                    show();
                    break;
                case 2:
                    signin();
                    break;
                case 3:
                    regist();
                    break;
                case 4:
                    System.out.println("感谢您的使用");
                    System.exit(0);
                    break;


            }
        }
    }

    //注册功能
    private static void regist() {
        String username = null;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            //判断：输入的用户名是否存在
            boolean flag=false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!=null){
                    if (arr1[i].equals(username)){
                        flag=true;
                        break;
                    }
                }
            }
            if (flag==true){
                System.out.println("用户名已经存在，请重新输入");
            }else {
                break;
            }
        }
        System.out.println("请输入密码：");
        String password = sc.next();
        //判断：当前数据是否装满了
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == null) {
                flag = false;
                break;
            }
        }
        if (flag == false) {
            //没有装满
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == null) {
                    arr1[i] =username;
                    arr2[i] = password;
                    break;
                }
            }
        }else if (flag==true){
            //装满了，对数据进行扩容
            String [] newArr1=new String[arr1.length+3];
            String [] newArr2=new String[arr2.length+3];
            //将原数组的数据全部复制到新的数组中
            System.arraycopy(arr1,0,newArr1,0,arr1.length);
            System.arraycopy(arr2,0,newArr2,0,arr2.length);
            arr1=newArr1;
            arr2=newArr2;
            //用户名和密码保存
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!=null){
                    arr1[i] =username;
                    arr2[i] = password;
                    break;
                }
            }
        }
        System.out.println("注册成功");
    }

    //登录功能
    private static void signin() {
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        //判断输入的用户名是否存在
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != null) {
                if (arr1[i].equals(username) && arr2[i].equals(password)) {
                    System.out.println("登录成功");
                    return;
                }
            }
        }
        System.out.println("登陆失败");

    }

    //查看功能
    private static void show() {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != null) {
                System.out.println("用户名:" + arr1[i] + ",密码:" + arr2[i]);
            }
        }
    }
}
