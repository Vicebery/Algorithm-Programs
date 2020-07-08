package Java;

import java.util.ArrayList;
import java.util.List;

public class Solution763 {
    public static void main(String[] args){
        String arg = "ababcbacadefegdehijhklij";
        Solution763 s = new Solution763();

        System.out.println(s.partitionLabels(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/partition-labels/ 划分字母区间
     * @Author: vicebery
     * @Date: 2020/0708
     **/
    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<>();
        int head = 0;
        int tail = 0;
        int[][] map = new int[26][2];
        char[] cs = S.toCharArray();
        for(int i = 0 ;i<cs.length;i++){
            if(map[cs[i]-'a'][0]>0){
                map[cs[i]-'a'][1] = i+1;
            }else{
                map[cs[i]-'a'][0] = i+1;
            }
        }
        for(int i = 0 ;i<cs.length;i++){
            head = map[cs[i]-'a'][0];
            tail = map[cs[i]-'a'][1];
            if(tail==0){
                ans.add(1);
                continue;
            }else{
                for(i++;i<tail-1;i++){
                    if(tail<map[cs[i]-'a'][1]){
                        tail = map[cs[i]-'a'][1];
                    }
                }
                ans.add(tail-head+1);
            }
        }
        return ans;
    }
}