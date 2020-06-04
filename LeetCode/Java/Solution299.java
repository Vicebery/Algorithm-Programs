package Java;


public class Solution299 {
    public static void main(String[] args){
        String s = "1123";
        String g = "0111";
        System.out.println(getHint(s,g));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/bulls-and-cows/ 猜数字游戏
     * @Author: vicebery  
     * @Date: 2020/0603
     **/


    public static String getHint(String secret, String guess) {
        int A = 0;
        int B = 0;

        for(int i =0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                A++;
            }
        }
        int[] hash = new int[10];
        for(Character c:secret.toCharArray()){
            int cur = c - '0';
            hash[cur]++;
        }
        int sum = 0;
        for(Character c:guess.toCharArray()){
            int cur = c - '0';
            if(hash[cur]>0){
                hash[cur]--;
                sum++;
            }
        }
        B = sum - A;
        return A+"A"+B+"B";
    }
}