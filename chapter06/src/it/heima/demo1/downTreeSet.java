package it.heima.demo1;

import java.util.Comparator;
import java.util.TreeSet;
/*
    排序方式二；比较器排序。需要在treeset集合的构造方法中，传递比较器接口的实现类对象，编写排序条件
 */
public class downTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result=o2-o1;
                return result;
            }
        });
        ts.add(1);
        ts.add(5);
        ts.add(3);
        ts.add(4);
        ts.add(2);
        System.out.println(ts);
    }
}
