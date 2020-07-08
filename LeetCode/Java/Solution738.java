package Java;

public class Solution738 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution738 s = new Solution738();

        System.out.println(s.monotoneIncreasingDigits(1234));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/monotone-increasing-digits/  单调递增的数字
     * @Author: vicebery
     * @Date: 2020/0708
     **/
    public int monotoneIncreasingDigits(int N) {
        char[] num = String.valueOf(N).toCharArray();
        int n = num.length;
        if(n==1){
            return N;
        }
        int i=1;
        for(;i<n;i++){
            if(num[i-1]>num[i]){
                break;
            }
        }
        while(i>0 && i<n && num[i-1] > num[i]){
            i--;
            num[i]--;
        }
        for(i++;i<n;i++){
            num[i] = '9';
        }
        String s = String.valueOf(num);
        return Integer.valueOf(s);
    }
}