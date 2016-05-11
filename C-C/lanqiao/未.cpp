#include<iostream>
#include<cstdio>
#define MAXN 105 
#define MOD %1000000007
using namespace std;
long long dp[MAXN][MAXN];
int main()
{
    long long i,j,k,c,l,sum=0;
    cin>>k>>l;
    //初始化第一个格子 
    dp[0][1]=0; 
    for(i=1;i<k;i++)
        dp[i][1]=1;
    sum=k-1;
    for(i=2;i<=l;i++)
    {//格子
        for(j=0;j<k;j++)
        {
            if(j==0)
            {
                dp[j][i]=(dp[j][i]+(dp[j][i-1])MOD)MOD;
                for(c=2;c<k;c++) 
                    dp[j][i]=(dp[j][i]+(dp[c][i-1])MOD)MOD;　　//必须循环加，用sum减去一些值会负溢出！！
            }
            else if(j==k-1)
            {
                for(c=0;c<k-2;c++)
                    dp[j][i]=(dp[j][i]+(dp[c][i-1])MOD)MOD;
                dp[j][i]=(dp[j][i]+(dp[j][i-1])MOD)MOD;
            }
            else
            {
                for(c=0;c<k;c++)
                {
                    if(c!=j-1&&c!=j+1)
                        dp[j][i]=(dp[j][i]+(dp[c][i-1])MOD)MOD;
                }
            }
            //cout<<dp[j][i]<<" ";
         } 
         sum=0;
         for(j=0;j<k;j++)
             sum=((sum)MOD+(dp[j][i])MOD)MOD;
        // cout<<endl; 
        //cout<<sum<<endl;
    }
    cout<<sum<<endl;
    return 0;
}
