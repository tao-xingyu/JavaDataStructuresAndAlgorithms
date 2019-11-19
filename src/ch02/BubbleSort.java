package ch02;

/**
 * 冒泡排序
 *
 * @author xingyu.tao@qq.com
 * @create 2019-11-19 23:41
 */
public class BubbleSort {
    public static void sort(long[] arr) {
        long temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
