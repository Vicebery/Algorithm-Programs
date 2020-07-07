package Java;

public class Solution649 {
    public static void main(String[] args){
        String arg = "RDD";
        Solution649 s = new Solution649();

        System.out.println(s.predictPartyVictory(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/dota2-senate/
     * @Author: vicebery
     * @Date: 2020/0707
     **/
    public String predictPartyVictory(String senate) {
        int person = 0;
        boolean R = true, D = true;
        char[] senateList = senate.toCharArray();
        while (R && D) {
            R = false;
            D = false;
            for (int i = 0; i < senate.length(); i++) {
                char curSenate = senateList[i];
                if (curSenate == 'R') {
                    R = true;
                    if (person < 0) {
                        senateList[i] = '0';
                    }
                    person++;
                }
                if (curSenate == 'D') {
                    D = true;
                    if (person > 0) {
                        senateList[i] = '0';
                    }
                    person--;
                }
            }
        }
        return person > 0 ? "Radiant" : "Dire";
    }
}