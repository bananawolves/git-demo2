package Test;

public class arr03 {
    public static void main(String[] args) {
        /*要求:定义一个数组1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素 如果是奇数,则将当前值扩大一倍
                             如果是偶数,则将当前值缩小一倍*/
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                arr[i]=arr[i]/2;
            }else {
                arr[i]=arr[i]*2;
            }
            System.out.println(arr[i]);
        }

    }
}
