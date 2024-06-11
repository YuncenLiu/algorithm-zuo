package learn;

import java.util.StringJoiner;

/**
 * @belongsProject: algorithm-zuo
 * @belongsPackage: learn
 * @author: Xiang想
 * @createTime: 2024-06-11  15:27
 * @description: TODO
 * @version: 1.0
 */
public class Yun_004_SelectBubbleInsert {

    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 7, 3};

        bubbleSort(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int i : arr) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println("arr = " + stringJoiner);
    }

    // 在一个数组中交换两个下标的数
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // 选择排序
    public static void selectionSort(int[] arr) {
        // 排查为空、小于2的
        if (arr == null || arr.length < 2) {
            return;
        }
        // i ~ n-1 范围
        for (int minIndex, i = 0; i < arr.length - 1; i++) {

            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }


    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    // 插入排序
    public static void insertionSort(int[] arr){

    }
}
