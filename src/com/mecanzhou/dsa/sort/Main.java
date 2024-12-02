package com.mecanzhou.dsa.sort;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhoumaogen
 * CREATED AT 2024-12-02 20:36
 */
public class Main {
    public static void main(String[] args) {
        int testTime = 5000;
        int maxSize = 10;
        int maxValue = 100;

        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            insertSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "OK!" : "?");

//        int[] arr1 = generateArray(maxSize, maxValue);
//        printArray(arr1);
//        selectSort(arr1);
//        printArray(arr1);
    }

    /**
     * 选择排序： 0~N-1次，每次从未归位的开始，最小的放该位置，复杂度On2
     */
    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    /**
     * 冒泡排序： 0~N-1次，每次从0开始，最大往后放，复杂度On2
     */
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j ] > arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 插入排序： 0~N-1次，每次从x(x递增)开始，保证x之前有序，复杂度On2
     */
    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j+1, j);
            }
        }
    }

    // 对数器打印数组
    private static void swap(int[] arr, int source, int target) {
        if (source == target) {
            return;
        }
        arr[source] = arr[source] ^ arr[target];
        arr[target] = arr[source] ^ arr[target];
        arr[source] = arr[source] ^ arr[target];
    }


    // 对数器打印数组
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    /**
     * 对数器对比方法
     *
     * @param a 原始队列
     */
    private static void comparator(int[] a) {
        Arrays.sort(a);
    }

    // 对数器比较数组
    private static boolean isEqual(int[] arr, int[] res) {
        if (arr.length != res.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != res[i]) {
                return false;
            }
        }
        return true;
    }

    // 对数器生成数组
    private static int[] generateArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random());
        }
        return arr;
    }

    // 对数器复制数组
    private static int[] copyArray(int[] arr) {
        int[] res = new int[arr.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
        return res;
    }
}
