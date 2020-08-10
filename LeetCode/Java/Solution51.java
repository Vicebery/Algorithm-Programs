package Java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution51 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution51 s = new Solution51();
        List<List<String>> res = s.solveNQueens(4);
        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/n-queens/ n皇后问题
     * @Author: vicebery
     * @Date: 2020/0810
     **/
    private Set<Integer> col;
    private Set<Integer> master;
    private Set<Integer> slave;
    private int n;
    private List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        res = new ArrayList<>();
        if (n == 0) {
            return res;
        }

        col = new HashSet<>();
        master = new HashSet<>();
        slave = new HashSet<>();

        Stack<Integer> stack = new Stack<>();
        backtrack(0, stack);
        return res;
    }

    private void backtrack(int row, Stack<Integer> stack) {
        if (row == n) {
            List<String> board = convert2board(stack, n);
            res.add(board);
            return;
        }

        // 针对每一列，尝试是否可以放置
        // 斜着特点，横纵坐标和一定，横纵坐标差值一定
        for (int i = 0; i < n; i++) {
            if (!col.contains(i) && !master.contains(row + i) && !slave.contains(row - i)) {
                stack.add(i);
                col.add(i);
                master.add(row + i);
                slave.add(row - i);

                backtrack(row + 1, stack);

                slave.remove(row - i);
                master.remove(row + i);
                col.remove(i);
                stack.pop();
            }
        }
    }

    private List<String> convert2board(Stack<Integer> stack, int n) {
        List<String> board = new ArrayList<>();
        for (Integer num : stack) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                stringBuilder.append(".");
            }
            stringBuilder.replace(num, num + 1, "Q");
            board.add(stringBuilder.toString());
        }
        return board;
    }

//    public List<List<String>> solveNQueens(int n) {
//        List<List<String>> res = new LinkedList<>();
//        if (n <= 0) return res;
//        dfs(res, n, 0, new LinkedHashSet<>(), new HashSet<>(), new HashSet<>());
//        return res;
//    }
//
//    private void dfs(List<List<String>> res, int n, int row,
//                     LinkedHashSet<Integer> column, Set<Integer> pie, Set<Integer> na) {
//        if (row == n) {
//            res.add(draw(column));
//            return;
//        }
//
//        for (int i = 1; i <= n; i++) {
//            if (column.contains(i) || pie.contains(row + i) || na.contains(row - i)) continue;
//
//            column.add(i);
//            pie.add(row + i);
//            na.add(row - i);
//
//            dfs(res, n, row + 1, column, pie, na);
//
//            column.remove(i);
//            pie.remove(row + i);
//            na.remove(row - i);
//        }
//    }
//
//    private List<String> draw(LinkedHashSet<Integer> column) {
//        return column.stream().map(col ->
//                IntStream.rangeClosed(1, column.size()).mapToObj(i -> i == col ? "Q" : ".").collect(Collectors.joining(""))
//        ).collect(Collectors.toList());
//    }
}