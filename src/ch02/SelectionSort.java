package ch02;

/**
 * 选择排序
 *
 * @author xingyu.tao@qq.com
 * @create 2019-11-20 0:10
 */
public class SelectionSort {
    public static void sort(long []arr){
        int k;
        long temp;
        for(int i=0;i<arr.length-1;i++){
            k=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[k]){
                    //求出最小
                    k=j;
                }
            }
            //和第一个交换
            temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
        }
    }
}
