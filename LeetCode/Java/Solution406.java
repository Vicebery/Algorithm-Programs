package Java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution406 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution406 s = new Solution406();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/queue-reconstruction-by-height/
     * @Author: vicebery
     * @Date: 2020/0706
     **/
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(o1, o2)->o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);
        List res = new LinkedList<>();
        for(int[] man:people){
            res.add(man[1],man);
        }
        return (int[][]) res.toArray(new int[res.size()][2]);
    }
}