package Java;

public class Solution189 {
    public static void main(String[] args){
        int[] arg = {1,2,3,4,5,6,7};
        rotate(arg,3);
        for(int i:arg)
            System.out.println(i+" ");
    }

    /**
     * @Description:  https://leetcode-cn.com/problems/rotate-array/ 数组向右移动k个位置
     * @Author: vicebery
     * @Date: 2020/
     **/
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int count = 0;         // 记录交换位置的次数，n个同学一共需要换n次
        for (int start = 0; count < len; start++) {
            int cur = start;       // 从0位置开始换位子
            int pre = nums[cur];
            do {
                int next = (cur + k) % len;
                int temp = nums[next];    // 来到角落...
                nums[next] = pre;
                pre = temp;
                cur = next;
                count++;
            } while (start != cur);     // 循环暂停，回到起始位置，角落无人

        }
    }
}