package Java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution13 {
    public static void main(String[] args){
        String s= "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/roman-to-integer/ 罗马数字 转 int
     * @Author: vicebery
     * @Date: 2020/4/24
     **/
    public static int romanToInt(String s) {
        int res=0;
        Roman[] romans = new Roman[13];
        romans[0] = new Roman("M",1000);
        romans[1] = new Roman("CM",900);
        romans[2] = new Roman("D",500);
        romans[3] = new Roman("CD",400);
        romans[4] = new Roman("C",100);
        romans[5] = new Roman("XC",90);
        romans[6] = new Roman("L",50);
        romans[7] = new Roman("XL",40);
        romans[8] = new Roman("X",10);
        romans[9] = new Roman("IX",9);
        romans[10] = new Roman("V",5);
        romans[11] = new Roman("IV",4);
        romans[12] = new Roman("I",1);

        int index =0;
        for(int i=0;i<s.length();){
            if(s.startsWith(romans[index].word,i)){
                res+= romans[index].count;
                if(index%2==0){
                    i++;
                }else{
                    i=i+2;
                }
            }else{
                index++;
            }
        }
        return res;
    }
    static class Roman{
        String word;
        int count;
        public Roman(String word, int count){
            this.word = word;
            this.count = count;
        }
    }
}