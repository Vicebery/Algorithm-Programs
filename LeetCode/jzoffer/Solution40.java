package jzoffer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Solution40 {
    public static void main(String[] args){
        int[] arg = {3,7,1,2};
        int k = 2;
        Solution40 s = new Solution40();
        int[] arr = s.getLeastNumbers(arg,k);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/  最小的k个数
     * @Author: vicebery
     * @Date: 2020/0808
     **/
    // 最小堆 优先队列
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        if (k == 0 || k >= arr.length) {
            return res;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> n2 - n1);  // 大顶堆
        for (int n : arr) {
            if (heap.size() < k) {
                heap.add(n);
            } else if (heap.peek() > n) {
                heap.poll();
                heap.add(n);
            }
        }
        int index = 0;
//        迭代器遍历
//        Iterator<Integer> it = heap.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        for (Integer i : heap) {
            res[index++] = i;
        }
        return res;
    }
}