package com.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Vote {
    public static void main(String[] args) {
       while (true){
           //用户的操作界面
           System.out.println("1：添加候选人，2:查询当前投票 3：投票 4：退出");
           //键盘录入操作指令
           System.out.println("请输入操作指令");
           Scanner sc=new Scanner(System.in);
           int command=sc.nextInt();
           //对指令进行判断
           switch (command){
               case 1:
                   //添加候选人
                   addPerson();
                   break;
               case 2:
                   //查询当前投票
                   findCurrentVote();
                   break;
               case 3:
                   //投票
                   startVote();
                   break;
               case 4:
                   //退出
                   System.out.println("谢谢使用！");
                   System.exit(0);
                   break;
               default:
                   System.out.println("您输入的指令有误，请重新输入");
                   break;
           }
       }
    }

    private static void startVote() {
        //获取目前所有的投票数据
        Map<String,Integer>personMap=getAllPerson();
        //让用户输入候选人的名称
        System.out.println("请输入候选人的名称：");
        Scanner sc= new Scanner(System.in);
        String personName=sc.nextLine();
        if (!personMap.keySet().contains(personName)){
            System.out.println("您输入的候选人名称不存在！");
            return;
        }
        //请输入投票数量
        System.out.println("请输入投票数量：");
        int number=sc.nextInt();
        personMap.put(personName,personMap.get(personName)+number);
        //把最新的投票数据保存到文件中
        savePersonInFile(personMap);
    }

    private static void findCurrentVote() {
        Map<String,Integer>allPerson=getAllPerson();
        Set<Map.Entry<String,Integer>> entries=allPerson.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    private static void addPerson() {
        //获取所有的候选人数据
        Map<String,Integer> personMap=getAllPerson();
        //键盘录入候选人数据
        System.out.println("请输入候选人的名称：");
        Scanner sc =new Scanner(System.in);
        String personName=sc.nextLine();
        if (personMap.keySet().contains(personName)){
            System.out.println("候选人已经存在");
            return;
        }
        personMap.put(personName,0);
        //把候选人的数据保存到文件中
        savePersonInFile(personMap);
    }

    private static void savePersonInFile(Map<String, Integer> personMap) {
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter("vote.txt"));
            Set<Map.Entry<String,Integer>>entries=personMap.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                String voteInfo=entry.getKey()+":"+entry.getValue();
                bw.write(voteInfo);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw!=null){
                try {
                    bw.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    private static Map<String, Integer> getAllPerson() {
        //创建一个File对象，表示存储投票数据的文件
        File file=new File("vote.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //创建一个Map集合对象，用来存储投票数据
        Map<String,Integer>voteMap=new HashMap<>();
        BufferedReader br=null;
        try {
            //创建bufferedReader对象
            br=new BufferedReader(new FileReader("vote.txt"));
            String line;
            while ((line=br.readLine())!=null){
                String[] voteInfo=line.split(":");
                voteMap.put(voteInfo[0],Integer.parseInt(voteInfo[1]));
            }
            return voteMap;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
