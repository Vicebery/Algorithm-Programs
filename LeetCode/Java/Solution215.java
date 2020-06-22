package Java;

import java.util.BitSet;
import java.util.PriorityQueue;

public class Solution215 {
    public static void main(String[] args){
        int[] arg = {23,45,566,7,877,1,2};
        int k = 4;
        System.out.println(findKthLargest(arg,k));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/kth-largest-element-in-an-array/ 数组中的第K个最大元素
     * @Author: vicebery
     * @Date: 2020/0616
     **/
    // 最小堆实现，优先队列
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> n1 - n2);  // 默认实现为 最小堆
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        return heap.poll();
    }
}