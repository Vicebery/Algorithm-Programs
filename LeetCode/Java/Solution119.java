package Java;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    public static void main(String[] args) {
        Integer[] arg = getRow2(10).stream().toArray(n -> new Integer[n]);
        for (int i = 0; i < arg.length; i++)
            System.out.print(arg[i] + " ");
    }

//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }
    /**
     * @Description: https://leetcode-cn.com/problems/pascals-triangle-ii/ 杨辉三角
     * @Author: vicebery
     * @Date: 2020/0518
     **/
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex);
        if(rowIndex<0) return res;
        List<Integer> frontRow = new ArrayList<>(1);
        frontRow.add(1);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> curRow = new ArrayList<>(i+1);
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    curRow.add(j,1);
                }else{
                    curRow.add(j,frontRow.get(j-1)+frontRow.get(j));
                }
            }
            frontRow = curRow;
        }
        return frontRow;
    }

    //数学公式法 求解
    public static List<Integer> getRow2(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        int N = rowIndex;
        for (int k = 0; k <= N; k++) {
            ans.add(Combination(N, k));
        }
        return ans;
    }

    public static int Combination(int N, int k) {
        long res = 1;
        for (int i = 1; i <= k; i++)
            res = res * (N - k + i) / i;
        return (int) res;
    }

}