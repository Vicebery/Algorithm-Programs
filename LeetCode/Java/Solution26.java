package Java;

public class Solution26 {
    public static void main(String[] args){
        int[] arg = {1,2,2,3,4,5,5,6};
        System.out.println(removeDuplicates(arg));
    }

    /**
     * @Description:
     * @Author: vicebery
     * @Date: 2020/426
     **/
    public static int removeDuplicates(int[] nums) {
        int dupCount=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                dupCount++;
            }else{
                nums[i-dupCount] = nums[i];
            }
        }
        return nums.length - dupCount;
    }
}