package learn;

/**
 * @Description:
 * @Author: Vicebery
 * @Date: 2019/10/14
 */
public class Permutation {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] tmp = new int[]{0,0,0,0};
        printPermutation(arr,4, tmp, 0);
//        printSubset(arr,4, tmp, 0);
    }

    // 字典序 全排列
    public static void printPermutation(int[] arr, int n, int[] tmp, int cur){
        if (cur == n) {   //判断填充完成，输出
            for (int i = 0; i < n; i++) {
                System.out.print(tmp[i] + " ");
            }
            System.out.println(" ");
        } else for (int i = 0; i < n; i++) {  //开始按照顺序一个个将arr[i}填充
            boolean ok = true;
            for (int j = 0; j < cur; j++) {
                if (tmp[j] == arr[i])  //判断当前要填充的元素是否已经用过
                    ok = false;
            }
            if (ok) {
                tmp[cur] = arr[i];
                printPermutation(arr, n, tmp, cur + 1);
            }
        }
    }

    // 字典序 全排列 去除相同元素影响
    public static void printPermutation2(int[] arr, int n, int[] tmp, int cur){
        if (cur == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(tmp[i] + " ");
            }
            System.out.println(" ");
        } else for (int i = 0; i < n; i++)
            if (i == 0 || arr[i] != arr[i - 1]) {   //碰到相同元素，则不进行再次填充了
                int arrCount = 0, tmpCount = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i])
                        arrCount++;
                }
                for (int j = 0; j < cur; j++) {
                    if (tmp[j] == arr[i])
                        tmpCount++;
                }
                if (tmpCount < arrCount) {
                    tmp[cur] = arr[i];
                    printPermutation2(arr, n, tmp, cur + 1);
                }
            }
    }

    // 打印子集 字典序
    public static void printSubset(int[] arr, int n, int[] tmp, int cur){
        for (int i = 0; i < cur; i++) {
            System.out.print(tmp[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < n; i++) {  //开始按照顺序一个个将arr[i}填充
            boolean ok = true;
            for (int j = 0; j < cur; j++) {
                if (tmp[j] == arr[i])  //判断当前要填充的元素是否已经用过
                    ok = false;
            }
            if (ok) {
                tmp[cur] = arr[i];
                printSubset(arr, n, tmp, cur + 1);
            }
        }
    }
}
