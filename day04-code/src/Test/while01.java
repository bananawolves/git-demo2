package Test;

public class while01 {
    public static void main(String[] args) {
        /*需求:世界最高峰珠穆朗玛峰的高度时8844.43m=8844430mm
        如果我有一张足够大的纸,厚度为0.1mm,需要折叠多少次,可以折成珠穆朗玛峰的高度
         */
        double i = 0.1;
        int count = 0;
        while (i < 8844430) {
            i = i * 2;
            count++;
        }
        System.out.println(count);
    }
}
