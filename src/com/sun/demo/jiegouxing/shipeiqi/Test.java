/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Test
 * Author:   sun
 * Date:     2019/3/6 15:07
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/6 15:07           v1.0.0
 */
package com.sun.demo.jiegouxing.shipeiqi;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/6
 * @since v1.0.0
 */
public class Test {
    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();  //针对抽象目标接口编程
        int scores[] = {84,76,50,69,90,91,88,96}; //定义成绩数组
        int result[];
        int score;

        System.out.println("成绩排序结果：");
        result = operation.sort(scores);
        //遍历输出成绩
        for(int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = operation.search(result,90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        }
        else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = operation.search(result,92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        }
        else {
            System.out.println("没有找到成绩92。");
        }
    }
}

/**
 * 抽象成绩操作类：目标接口
 */
interface ScoreOperation {
    public int[] sort(int array[]); //成绩排序
    public int search(int array[],int key); //成绩查找
}

/**
 * 快速排序类：适配者
 */
class QuickSort {
    public int[] quickSort(int array[]) {
        sort(array,0,array.length-1);
        return array;
    }

    public void sort(int array[],int p, int r) {
        int q=0;
        if(p<r) {
            q=partition(array,p,r);
            sort(array,p,q-1);
            sort(array,q+1,r);
        }
    }

    public int partition(int[] a, int p, int r) {
        int x=a[r];
        int j=p-1;
        for (int i=p;i<=r-1;i++) {
            if (a[i]<=x) {
                j++;
                swap(a,j,i);
            }
        }
        swap(a,j+1,r);
        return j+1;
    }

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

/**
 * 二分查找类：适配者
 */
class BinarySearch {
    public int binarySearch(int array[],int key) {
        int low = 0;
        int high = array.length -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if(midVal < key) {
                low = mid +1;
            }
            else if (midVal > key) {
                high = mid -1;
            }
            else {
                return 1; //找到元素返回1
            }
        }
        return -1;  //未找到元素返回-1
    }
}

/**
 * 操作适配器：适配器
 */
class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj; //定义适配者QuickSort对象
    private BinarySearch searchObj; //定义适配者BinarySearch对象

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    public int[] sort(int array[]) {
        return sortObj.quickSort(array); //调用适配者类QuickSort的排序方法
    }

    public int search(int array[],int key) {
        return searchObj.binarySearch(array,key); //调用适配者类BinarySearch的查找方法
    }
}