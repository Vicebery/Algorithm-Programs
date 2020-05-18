package Java;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public static void main(String[] args){
        int numRows = 5;
        List<List<Integer>> res = new ArrayList<>(numRows);
        res = generate(numRows);
        for(int i=0;i<numRows;i++){
            for(int j=0;j<res.get(i).size();j++)
                System.out.print(res.get(i).get(j)+" ");
            System.out.println(" ");
        }

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
     * @Description: https://leetcode-cn.com/problems/pascals-triangle/ 杨辉三角
     * @Author: vicebery
     * @Date: 2020/0518
     **/
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);
        if(numRows<=0) return res;
        List<Integer> firstRow = new ArrayList<>(1);
        firstRow.add(1);
        res.add(0,firstRow);
        for(int i=1;i<numRows;i++){
            List<Integer> curRow = new ArrayList<>(i+1);
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    curRow.add(j,1);
                }else{
                    List<Integer> frontRow = res.get(i-1);
                    curRow.add(j,frontRow.get(j-1)+frontRow.get(j));
                }
            }
            res.add(i,curRow);
        }
        return res;
    }
}