package it.heima.test03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class joker {
    public static void main(String[] args) {
        //1.准备牌
        HashMap<Integer,String> map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        map.put(1,"大王");
        map.put(2,"小王");
        list.add(1);
        list.add(2);
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[] colors={"♠","♥","♣","♦"};
        int index=3;
        for (String number : numbers) {
            for (String color : colors) {
                map.put(index,number+color);
                list.add(index);
                index++;
            }
        }
        //2.洗牌
        Collections.shuffle(list);



        //3.发牌
        ArrayList<Integer> diPai =new ArrayList<>();
        ArrayList<Integer> player1 =new ArrayList<>();
        ArrayList<Integer> player2 =new ArrayList<>();
        ArrayList<Integer> player3 =new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i>=51){
                diPai.add(list.get(i));
            }else if(i%3==0){
                player1.add(list.get(i));
            }else if(i%3==1){
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }
        //4.排序
        Collections.sort(diPai);
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        //5.看牌
        look("周润发",player1,map);
        look("刘德华",player2,map);
        look("周星驰",player3,map);
        look("底牌",diPai,map);
    }

    private static void look(String name, ArrayList<Integer> list, HashMap<Integer, String> map) {
        System.out.println(name+":");
        for (Integer number : list) {
            System.out.print(map.get(number)+"");
        }
        System.out.println();
    }
}
