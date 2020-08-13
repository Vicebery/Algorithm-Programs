package Java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution212 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution212 s = new Solution212();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/word-search-ii/ 单词搜索2
     * @Author: vicebery
     * @Date: 2020/0811
     **/
    private int rows, cols;
    private char[][] board;
    // Trie的根节点
    private Node root;
    // DFS遍历方向
    private int[][] direct = {{0, 1, 0, -1}, {-1, 0, 1, 0}};
    private LinkedList<String> ans;
    // 标记是否已经访问
    private boolean[][] marked;

    // Trie需要的节点
    class Node {
        HashMap<Character, Node> children;
        String word;

        public Node(String word) {
            this.children = new HashMap<>();
            this.word = word;
        }

        public Node() {
            this.children = new HashMap<>();
            this.word = null;
        }
    }

    // Trie的操作
    private void delete(String str) {
        delete(root, str, 0);
    }

    private Node delete(Node current, String str, int d) {
        if (current == null) return null;
        if (d == str.length()) {
            if (current.children.isEmpty()) {
                return null;
            }
            current.word = null;
            return current;
        }
        char c = str.charAt(d);
        Node next = delete(current.children.get(c), str, d + 1);
        current.children.put(c, next);
        if (next == null && current.word == null && current.children.size() <= 1) {
            return null;
        }
        return current;
    }

    private void insert(String str) {
        insert(root, str, 0);
    }

    private Node insert(Node current, String str, int d) {
        if (current == null) {
            current = new Node();
        }
        if (d == str.length()) {
            current.word = str;
            return current;
        }
        char c = str.charAt(d);
        current.children.put(c, insert(current.children.get(c), str, d + 1));
        return current;
    }

    public List<String> findWords(char[][] board, String[] words) {
        this.rows = board.length;
        this.cols = board[0].length;
        this.board = board;
        this.root = new Node();
        this.ans = new LinkedList<>();
        this.marked = new boolean[rows][cols];
        int len = words.length;

        for (int i = 0; i < len; i++) {
            insert(words[i]);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char c = board[i][j];
                if (root.children.get(c) != null) {
                    dfs(i, j, root.children.get(c));
                }
            }
        }
        return this.ans;
    }

    private void dfs(int row, int col, Node current) {
        if (current == null) {
            return;
        }
        if (current.word != null) {
            this.ans.add(current.word);
            delete(current.word);
        }
        if (current.children.isEmpty()) {
            return;
        }
        marked[row][col] = true;
        for (int i = 0; i < 4; i++) {
            int newRow = row + direct[0][i];
            int newCol = col + direct[1][i];
            if (valid(newRow, newCol)) {
                char c = board[newRow][newCol];
                if (current.children.get(c) != null) {
                    dfs(newRow, newCol, current.children.get(c));
                }
            }
        }
        marked[row][col] = false;
    }

    private boolean valid(int row, int col) {
        return row < rows && row >= 0 && col < cols && col >= 0 && !marked[row][col];
    }
}