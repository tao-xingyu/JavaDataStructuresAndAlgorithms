package ch01;

import org.junit.Test;

/**
 * @author xingyu.tao@qq.com
 * @create 2019-11-18 22:36
 */
public class ArrayTest {
    @Test
    public void testInsert(){
        MyArray myArray=new MyArray();
        myArray.insert(10);
        myArray.insert(9);
        myArray.insert(8);
        myArray.insert(7);
        myArray.insert(6);
        myArray.insert(5);
        myArray.display();
        System.out.println();
        //查找数据
        System.out.println(myArray.search(6));
    }

    @Test
    public void testDelete(){
        MyArray myArray=new MyArray();
        myArray.insert(10);
        myArray.insert(9);
        myArray.insert(8);
        myArray.insert(7);
        myArray.insert(6);
        myArray.insert(5);
        myArray.delete(0);
        myArray.display();
    }
    @Test
    public void testUpdate(){
        MyArray myArray=new MyArray();
        myArray.insert(10);
        myArray.insert(9);
        myArray.insert(8);
        myArray.insert(7);
        myArray.insert(6);
        myArray.insert(5);
        myArray.update(1,1000);
        myArray.display();
    }
    @Test
    public void testGet(){
        MyArray myArray=new MyArray();
        myArray.insert(10);
        myArray.insert(9);
        myArray.insert(8);
        myArray.insert(7);
        myArray.insert(6);
        myArray.insert(5);
        System.out.println(myArray.get(3));
    }
    @Test
    public void testSortInsert(){
        MyArray myArray=new MyArray();
        myArray.sortInsert(10);
        myArray.sortInsert(8);
        myArray.sortInsert(9);
        myArray.sortInsert(6);
        myArray.sortInsert(11);
        myArray.display();
    }
    @Test
    public void testBinarySearch(){
        MyArray myArray=new MyArray();
        myArray.sortInsert(10);
        myArray.sortInsert(8);
        myArray.sortInsert(9);
        myArray.sortInsert(6);
        myArray.sortInsert(11);
        System.out.println(myArray.binarySearch(8));
    }
}
