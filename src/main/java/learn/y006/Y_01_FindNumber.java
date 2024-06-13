package learn.y006;

/**
 * @belongsProject: algorithm-zuo
 * @belongsPackage: learn.y006
 * @author: Xiang想
 * @createTime: 2024-06-13  17:38
 * @description: TODO
 * @version: 1.0
 */
public class Y_01_FindNumber {
    public static void main(String[] args) {


    }

    public static boolean exit(int[] arr, int num) {
        int l = 0, r = arr.length - 1, m = 0;
        while (l <= r) {
            m = l + ((r - l) >> 1);
            if (arr[m] == num) {
                return true;
            } else if (arr[m] > num) {
                r = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}
