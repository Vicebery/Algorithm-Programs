package Java;

public class Solution134 {
    public static void main(String[] args){
        int[] gas = {3,3,4};
        int[] cost = {3,4,4};
        Solution134 s = new Solution134();

        System.out.println(s.canCompleteCircuit(gas,cost));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/gas-station/ 加油站
     * @Author: vicebery
     * @Date: 2020/0623
     **/
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for(int i = 0;i<n;i++){
            if(gas[i]>=cost[i]){
                int cur = i;
                int les = 0;
                while(true){
                    les = les + gas[cur] - cost[cur] ;
                    if(les<0){
                        break;
                    }
                    cur = (cur+1)%n;
                    if(cur==i){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}