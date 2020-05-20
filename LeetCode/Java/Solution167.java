package Java;

import java.util.HashMap;

public class Solution167 {
    public static void main(String[] args){
        int[] arg = {1,2,3,4,4,9,56,90};
        System.out.println(twoSum(arg,8)[0]);
        System.out.println(twoSum(arg,8)[1]);
    }

    /**
     * @Description: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/ 两数之和 双指针
     * @Author: vicebery
     * @Date: 2020/0520
     **/
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            hash.put(numbers[i], i + 1);
            if(target==numbers[i]*2 && numbers[i] == numbers[i+1]){  // 处理hashMap无法处理的情况，key相同
                res[0] = i+1;
                res[1] = i+2;
                return res;
            }
            if (hash.containsKey(target - numbers[i]) && numbers[i]!=target-numbers[i]) {
                int tmp = hash.get(target - numbers[i]);
                int max = (i + 1) > tmp ? (i + 1) : tmp;
                res[0] = i + 1 + tmp - max;
                res[1] = max;
                break;
            }
        }
        return res;
    }
}