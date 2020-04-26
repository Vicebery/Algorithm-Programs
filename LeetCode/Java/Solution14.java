package Java;

public class Solution14 {
    public static void main(String[] args){
        String[] arg = {"flower","flow","iflight"};
        System.out.println(longestCommonPrefix(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/longest-common-prefix/
     * @Author: vicebery
     * @Date: 2020/4/24
     **/
    public static String longestCommonPrefix(String[] strs)  {
        String res = "";
        if(strs.length==0) {
            return res;
        }
        int tail = strs[0].length();
        int head = 0;
        while(head<=tail){
            String subStr= strs[0].substring(0,head);
            for(int i=1;i<strs.length;i++){
                if(!strs[i].startsWith(subStr)){
                    return res;
                }
            }
            res = subStr;
            head++;
        }
        return res;
    }
}