package com.maczm.helloworld.service;

import org.springframework.stereotype.Service;

/**
 * 通用服务.
 *
 * @author wangzm
 */
@Service
public class CommonService {
    /**
     * 根据年龄和搜入计算皱纹.
     *
     * @param a 年龄
     * @param b 收入
     *
     * @return 皱纹
     */
    public int computerWrinkles(int a, int b) {
        return a + b;
    }
    
    /**
     * 二分查找.
     *
     * @param arr   数组
     * @param start 开始位置
     * @param end   结束位置
     * @param key   查找的值
     *
     * @return 位置
     */
    public int binarySearch(int[] arr, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr, start, mid - 1, key);
        } else {
            return binarySearch(arr, mid + 1, end, key);
        }
    }
    
    /**
     * 快速排序.
     */
    public int[] quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int i = start;
            int j = end;
            int key = arr[start];
            while (i < j) {
                while (i < j && arr[j] >= key) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && arr[i] < key) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = key;
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }
        return arr;
    }
    
    /**
     * 冒泡排序.
     *
     * @param arr 数组
     *
     * @return 排序后的数组
     */
    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
