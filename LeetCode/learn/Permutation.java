package learn;

/**
 * @Description:
 * @Author: Vicebery
 * @Date: 2019/10/14
 */
public class Permutation {
    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        int[] tmp = new int[]{0,0,0,0};
        printPermutation2(arr,4, tmp, 0);
    }

    public static void printPermutation(int[] arr, int n, int[] tmp, int cur){
        if(cur==n){
            for(int i=0;i<n;i++){
                System.out.print(tmp[i]+" ");
            }
            System.out.println(" ");
        }
        else for(int i=0;i<n;i++){
                boolean ok = true;
                for(int j=0;j<cur;j++){
                    if(tmp[j] == arr[i])
                        ok = false;
                }
                if(ok){
                    tmp[cur] = arr[i];
                    printPermutation(arr,n,tmp,cur+1);
                }
        }
    }

    public static void printPermutation2(int[] arr, int n, int[] tmp, int cur){
        if(cur==n){
            for(int i=0;i<n;i++){
                System.out.print(tmp[i]+" ");
            }
            System.out.println(" ");
        }
        else for(int i=0;i<n;i++)
        if(i==0 || arr[i]!=arr[i-1]){
            int arrCount = 0, tmpCount = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i])
                    arrCount++;
            }
            for(int j=0;j<cur;j++){
                if(tmp[j] == arr[i])
                    tmpCount++;
            }
            if(tmpCount < arrCount){
                tmp[cur] = arr[i];
                printPermutation2(arr,n,tmp,cur+1);
            }
        }
    }
}
