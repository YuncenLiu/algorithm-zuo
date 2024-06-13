package learn.y005;

import java.util.StringJoiner;

/**
 * @belongsProject: algorithm-zuo
 * @belongsPackage: learn
 * @author: Xiang想
 * @createTime: 2024-06-13  17:02
 * @description: TODO
 * @version: 1.0
 */
public class Yun_005_Validator {
    public static void main(String[] args) {

        Yun_005_Validator validator = new Yun_005_Validator();
        int N = 20;
        int V = 1000;

        int testTimes = 100;
        System.out.println("测试开始");
        for (int i = 0; i < testTimes; i++) {
            int[] ints = randomArray(N, V);
            int[] insert = validator.insertionSort(ints);
            int[] select = validator.selectionSort(ints);
            int[] bubble = validator.bubbleSort(ints);

            if (!sameArray(insert,select) || !sameArray(select,bubble)){
                System.out.println("测试出错");
                printArr(insert);
                printArr(select);
                printArr(bubble);
            }
        }
        System.out.println("测试成功");
    }

    /**
     * @description: 比较两个数组是否一致
     * @author: Xiang想
     * @date: 2024/6/13 17:20
     * @param: [arr1, arr2]
     * @return: boolean
     **/
    public static boolean sameArray(int[] arr1,int[] arr2){
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }


    /**
     * @description: 得到随机数组
     * @author: Xiang想
     * @date: 2024/6/13 17:11
     * @param: [n, v] n 长度、v 数组内数据范围
     * @return: int[n]{0 ～ v}
     **/
    public static int[] randomArray(int n, int v){
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * v)+1;
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int i : arr) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println("arr = " + stringJoiner);
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // 选择排序
    public int[] selectionSort(int[] arr) {
        // 排查为空、小于2的
        if (arr == null || arr.length < 2) {
            return arr;
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
        return arr;
    }


    // 冒泡排序
    public int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }


    // 插入排序
    public int[] insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
        return arr;
    }
}
