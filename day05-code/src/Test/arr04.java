package Test;

public class arr04 {
    public static void main(String[] args) {
        //冒泡排序，从高到低
        int [] arr={3,5,6,7,1,2,4};
        System.out.println("排序前的数组");
        printarr(arr);
        //比较的轮数
        for (int i = 0; i < arr.length-1; i++) {
            //每轮比较的次数
            for (int j = i+1; j <arr.length; j++) {
                int temp;
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("排序后的数组");
        printarr(arr);
    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}
