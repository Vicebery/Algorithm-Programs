package Java;

public class Solution984 {
    public static void main(String[] args){

        Solution984 s = new Solution984();

        System.out.println(s.strWithout3a3b(4,7));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/string-without-aaa-or-bbb/
     * @Author: vicebery
     * @Date: 2020/0624
     **/
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        if(A>B){
            while(A!=0 || B!=0){
                boolean tag = A>=B*2;
                if(A>=2){
                    sb.append("aa");
                    A = A -2;
                }else if(A==1){
                    sb.append('a');
                    A--;
                }
                if(tag){
                    if(B>0){
                        sb.append('b');
                        B--;
                    }
                }else{
                    if(B>=2){
                        sb.append("bb");
                        B = B-2;
                    }else if(B==1){
                        sb.append('b');
                        B--;
                    }
                }
            }
        }else{
            while(A!=0 || B!=0){
                boolean tag = B>=A*2;
                if(B>=2){
                    sb.append("bb");
                    B = B-2;
                }else if(B==1){
                    sb.append('b');
                    B--;
                }
                if(tag){
                    if(A>0){
                        sb.append('a');
                        A--;
                    }
                }else{
                    if(A>=2){
                        sb.append("aa");
                        A = A -2;
                    }else if(A==1){
                        sb.append('a');
                        A--;
                    }
                }

            }
        }
        return sb.toString();
    }
}