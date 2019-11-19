package ch02;

import org.junit.Test;

/**
 * @author xingyu.tao@qq.com
 * @create 2019-11-19 23:51
 */
public class SortTest {
    /**
     * 冒泡排序测试
     */
    @Test
    public void testBubbleSort() {
        long []arr=new long[]{11,9,12,-1,7,3,14,22,21,8};
        BubbleSort.sort(arr);
        for(long temp :arr){
            System.out.print(temp+" ");
        }
    }

    /**
     * 选择排序
     */
    @Test
    public void testSelectionSort() {
        long []arr=new long[]{11,9,12,-1,7,3,14,22,21,8};
       SelectionSort.sort(arr);
        for(long temp :arr){
            System.out.print(temp+" ");
        }
    }
}
