package Java;

import java.util.*;

public class Solution216 {
    public static void main(String[] args){
        int n = 9;
        int k = 3;
        Solution216 s = new Solution216();
        List<List<Integer>>  test = s.combinationSum3(k,n);
        for(List<Integer> list: test){
            for(int i:list){
                System.out.print(i+"  ");
            }
            System.out.println(" ");
        }

    }

    /**
     * @Description: https://leetcode-cn.com/problems/combination-sum-iii/ 组合数总和
     * @Author: vicebery
     * @Date: 2020/0622
     **/
    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> oneSolution = new ArrayDeque<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1,k,n);
        return ans;
    }

    // 深度搜索 剪枝
    public void dfs(int start, int k, int n){
        if (n < 0 || k < 0) {
            return;
        }
        if (k == 0 && n != 0) {
            return;
        }
        if (k == 0 && n == 0) {
            if (!oneSolution.isEmpty()) {
                List<Integer> tmp = new ArrayList<>(oneSolution);
                Collections.sort(tmp);
                ans.add(tmp);
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            oneSolution.push(i);
            dfs(++start, k - 1, n - i);
            oneSolution.pop();
        }
    }
}