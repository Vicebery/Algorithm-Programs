package Java;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution767 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution767 s = new Solution767();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/reorganize-string/
     * @Author: vicebery
     * @Date: 2020/0630
     **/
    public String reorganizeString(String S) {
        int n = S.length();
        int[] count = new int[26];  // 个十位存储当前字母，百位存储该字母出现次数
        for(char c:S.toCharArray()){
            count[c-'a'] +=100;
        }
        for(int i=0;i<26;i++){
            count[i]+=i;
        }
        Arrays.sort(count);
        if(count[25]/100 > (n+1)/2){ // 出现次数最多的次数 大于一半 即无解
            return "";
        }
        char[] ans = new char[n];
        int index = 1;
        for(int i=0;i<26;i++){
            int cCount = count[i]/100;
            char curC = (char)('a' + count[i]%100);
            for (int j = 0; j < cCount; ++j) {
                if (index >= n) index = 0;
                ans[index] = curC;
                index += 2;
            }
        }
        return String.valueOf(ans);
    }


    // 优先队列解法
    public String reorganizeString2(String S) {
        int N = S.length();
        int[] count = new int[26];
        for (char c : S.toCharArray()) count[c - 'a']++;
        PriorityQueue<MultiChar> pq = new PriorityQueue<MultiChar>((a, b) ->
                a.count == b.count ? a.letter - b.letter : b.count - a.count);

        for (int i = 0; i < 26; ++i)
            if (count[i] > 0) {
                if (count[i] > (N + 1) / 2) return "";
                pq.add(new MultiChar(count[i], (char) ('a' + i)));
            }

        StringBuilder ans = new StringBuilder();
        while (pq.size() >= 2) {
            MultiChar mc1 = pq.poll();
            MultiChar mc2 = pq.poll();
            /*This code turns out to be superfluous, but explains what is happening
            if (ans.length() == 0 || mc1.letter != ans.charAt(ans.length() - 1)) {
                ans.append(mc1.letter);
                ans.append(mc2.letter);
            } else {
                ans.append(mc2.letter);
                ans.append(mc1.letter);
            }*/
            ans.append(mc1.letter);
            ans.append(mc2.letter);
            if (--mc1.count > 0) pq.add(mc1);
            if (--mc2.count > 0) pq.add(mc2);
        }
        if (pq.size() > 0) ans.append(pq.poll().letter);
        return ans.toString();
    }

}

class MultiChar {
    int count;
    char letter;

    MultiChar(int ct, char ch) {
        count = ct;
        letter = ch;
    }
}
