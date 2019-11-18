package ch01;

/**
 * @author xingyu.tao@qq.com
 * @create 2019-11-18 22:26
 */
public class MyArray {
    public long[] arr;
    /**
     * 有效数据长度
     * int 默认 0
     */
    private int elements;

    public MyArray() {
        arr = new long[50];
    }

    public MyArray(int maxSize) {
        arr = new long[maxSize];
    }

    /**
     * 插入
     *
     * @param value
     */
    public void insert(long value) {
        arr[elements] = value;
        elements++;
    }

    /**
     * 显示数据
     */
    public void display() {
        System.out.print("[");
        for (int i = 0; i < elements; i++) {
            if (i < elements - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }

    /**
     * 根据值查找数据
     *
     * @param value 数据值
     * @return
     */
    public long search(long value) {
        int i;
        for (i = 0; i < elements; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == elements) {
            return -1;
        } else {
            return i;
        }
    }

    /**
     * 根据索引查找数据
     *
     * @param index 索引
     * @return
     */
    public long get(int index) {
        if (index >= elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    /**
     * 删除数据
     *
     * @param index
     */
    public void delete(int index) {
        if (index >= elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < elements; i++) {
            arr[index] = arr[index + 1];
        }
        elements--;
    }

    /**
     * 更新
     *
     * @param index    索引
     * @param newValue 新值
     */
    public void update(int index, long newValue) {
        if (index >= elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index] = newValue;
    }

    /**
     * 插入有序数组
     * 从小到大
     * @param value
     */
    public void sortInsert(long value){
        int i;
        for(i=0;i<elements;i++){
            if(arr[i]>value){
                break;
            }
        }
        for(int j = elements; j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = value;
        elements++;

    }
    /**
     * 二分查找
     * 必须是有序
     * @param value
     * @return
     */
    public long binarySearch(long value) {
        int mid;
        int low = 0;
        int pow = elements;
        while (true) {
            mid = (low + pow) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (low > pow) {
                return -1;
            } else {
                if (arr[mid] > value) {
                    pow = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
    }
}
