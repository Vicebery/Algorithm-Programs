package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution621 {
    public static void main(String[] args){
        char[] arg = {'A','A','A','B','B','B'};
        int n = 2;
        Solution621 s = new Solution621();

        System.out.println(s.leastInterval(arg,n));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/task-scheduler/
     * @Author: vicebery
     * @Date: 2020/0624
     **/
    // 在每轮中（时间n内），先安排次数最多的,不够则待命；
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        int[] map = new int[26];
        for(char c:tasks){
            map[c-'A']++;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(26,(n1, n2) -> n2 - n1);  // 大顶堆
        for(int i:map){
            if(i>0)
                queue.add(i);
        }
        while(!queue.isEmpty()){
            int i = 0;
            List<Integer> tmp = new ArrayList<>(26);
            while(i<=n){
                if(!queue.isEmpty()){
                    if(queue.peek()>1){
                        tmp.add(queue.peek()-1);
                        queue.poll();
                    }else{
                        queue.poll();
                    }
                }
                time++;
                if(queue.isEmpty() && tmp.size()==0){
                    break;
                }
                i++;
            }
            for(int t: tmp){
                queue.add(t);
            }
        }
        return time;
    }
}