package Java;

public class Solution836 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution836 s = new Solution836();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/rectangle-overlap/  矩形重叠
     * @Author: vicebery
     * @Date: 2020/0731
     **/
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2]<=rec2[0] || rec1[0]>=rec2[2] || rec1[1]>=rec2[3] || rec1[3]<=rec2[1]);
    }
}