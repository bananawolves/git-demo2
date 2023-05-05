package Test;

public class twoarr01 {
    public static void main(String[] args) {
        //要求：通过二维数组保存公司的销售数据
        //求每个小组的销售总金额
        //求公司的总销售金额
        int [][]arr=new int[3][];
        int []arr1={60,70,80};
        arr[0]=arr1;
        arr[1]=new int []{60,70,90};
        arr[2]=new int []{60,70,100};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int groupsum=0;
            for (int j = 0; j < arr[i].length; j++) {
                groupsum+=arr[i][j];
            }
            System.out.println("第"+(i+1)+"个小组的销售金额是"+groupsum);
            sum+=groupsum;
        }
        System.out.println("公司的总销售金额是"+sum);
    }
}
