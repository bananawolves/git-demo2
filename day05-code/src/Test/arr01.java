package Test;

public class arr01 {
    public static void main(String[] args) {
        //要求:定义一个数组村储1,2,3,4,5
        //遍历数组的每一个元素,并求和
        int arr[]={1,2,3,4,5};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
