package Java;

import java.util.*;

public class Solution658 {
    public static void main(String[] args){
        int[] arg = {0,1,1,1,2,3,6,7,8,9};
        System.out.println(findClosestElements(arg,9,4));
    }

    /**
     * @Description: 658 https://leetcode.com/problems/find-k-closest-elements/
     * @param: [arr, k, x]
     * @Return: java.util.List<java.lang.Integer>
     * @Author: vicebery
     * @Date: 2019/8/29
     **/
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(k==0 || arr.length<k) return null;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i=0;
        if(x<=arr[0]){
            for(int j=0;;j++){
                if(j==k) return res;
                else res.add(arr[j]);
            }
        }
        if(x>=arr[arr.length-1]){
            for(int j=arr.length-k;;j++){
                if(j==arr.length) return res;
                else res.add(arr[j]);
            }
        }
        for(; i<arr.length;i++){
            if(arr[i] > x){
                if((x-arr[i-1]) <= (arr[i]-x))
                    i--;
                break;
            }
        }
        res.add(arr[i]);
        int count = 1, left = i, right = i;
        while(count++!=k){
            if(left>=0 ) left--;
            if(right<= arr.length-1) right++;
            if(left==-1){
                res.add(arr[right]);
            }else if(right == arr.length){
                res.add(arr[left]);
            }else if((x-arr[left]) <= (arr[right] - x)){
                res.add(arr[left]);
                right--;
            }else{
                res.add(arr[right]);
                left++;
            }
        }
        Collections.sort(res);
        return res;
    }
}