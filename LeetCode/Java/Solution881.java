package Java;

import java.util.Arrays;

public class Solution881 {
    public static void main(String[] args){
        int[] arg = {3,5,3,4};
        Solution881 s = new Solution881();

        System.out.println(s.numRescueBoats(arg,5));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/boats-to-save-people/
     * @Author: vicebery
     * @Date: 2020/0708
     **/
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int n = people.length;
        int tail = people.length-1;
        int i = 0;
        while (i < n && tail > 0 && i < tail) {
            while (i < n && tail > 0 && i <= tail && people[i] + people[tail] > limit) {
                count++;
                tail--;
            }
            while (i < n && tail > 0 && i < tail && people[i] + people[tail] <= limit) {
                i++;
                tail--;
                count++;
            }
        }
        if(i==tail){
            count++;
        }
        return count;
    }
}