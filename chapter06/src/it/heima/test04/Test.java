package it.heima.test04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        HashSet<User> hs = new HashSet<>();
        User u1 = new User("张三", "123", new Date(), "18612341234", "126@qq.com");
        hs.add(u1);
        //键盘输入用户的注册数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        System.out.println("请输入确认密码：");
        String rePassword = sc.nextLine();
        System.out.println("请输入手机号：");
        String tel = sc.nextLine();
        System.out.println("请输入邮箱：");
        String email = sc.nextLine();
        System.out.println("请输入生日：");
        String birthday = sc.nextLine();

        //进行数据判断
        int status = 1;
        if (!password.equals(rePassword)) {
            status = 2;
            System.out.println("两次密码不一致");
        }
        if (!(birthday.charAt(4) == '-' && birthday.charAt(7) == '-')) {
            status = 2;
            System.out.println("生日格式不对");
        }
        if (!(tel.length() == 11 &&(tel.startsWith("13")||tel.startsWith("15")||tel.startsWith("18")||tel.startsWith("17")))) {
            status = 2;
            System.out.println("手机号格式不对");
        }
        if (!email.contains("@")) {
            status = 2;
            System.out.println("邮箱格式不对");
        }
        if (status==1){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date date=sdf.parse(birthday);
            User user=new User(username,password,date,tel,email);
            boolean b=hs.add(user);
            if (b==true){
                System.out.println("注册成功");
            }else {
                System.out.println("注册失败");
            }
        }else {
            System.out.println("注册失败");
        }
    }
}
