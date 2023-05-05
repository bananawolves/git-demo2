package Test;

public class for02 {
    public static void main(String[] args) {
        //需求:求1-100的偶数和
        int j = 0;
        for (int i = 1; i <=100; i++) {
            if (i%2==0) {
                j = j + i;
            }
        }
        System.out.println(j);
    }
}

