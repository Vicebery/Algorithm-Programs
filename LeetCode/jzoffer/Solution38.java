package jzoffer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution38 {
    public static void main(String[] args){
        String arg = "abcc";
        Solution38 s = new Solution38();
        String[] res = s.permutation(arg);
        System.out.println(Arrays.toString(res));
        // 字典序输出
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/ 字符串的排列 全排列 DFS
     * @Author: vicebery
     * @Date: 2020/0804
     **/
    List<String> res = new LinkedList<>();
    char[] c;

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    void dfs(int x) {
        if (x == c.length - 1) {
            res.add(String.valueOf(c)); // 添加排列方案
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) continue; // 重复，因此剪枝
            set.add(c[i]);
            swap(i, x); // 交换，将 c[i] 固定在第 x 位
            dfs(x + 1); // 开启固定第 x + 1 位字符
            swap(i, x); // 恢复交换
        }
    }

    void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

}