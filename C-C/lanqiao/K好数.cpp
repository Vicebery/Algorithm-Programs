//    20120228 By Vicebery 
//问题描述
//如果一个自然数N的K进制表示中任意的相邻的两位都不是相邻的数字，那么我们就说这个数是K好数。求L位K进制数中K好数的数目。例如K = 4，L = 2的时候，所有K好数为11、13、20、22、30、31、33 共7个。由于这个数目很大，请你输出它对1000000007取模后的值。
//
//输入格式
//输入包含两个正整数，K和L。
//
//输出格式
//输出一个整数，表示答案对10 0000 0007取模后的值。
//
//样例输入
//4 2
//
//样例输出
//7
//
//数据规模与约定
//对于30%的数据，KL <= 106；
//对于50%的数据，K <= 16， L <= 10；
//对于100%的数据，1 <= K,L <= 100。

#include"iostream"
#include"math.h"
using namespace std;
//bool IsK(int &n)
//{
//	int x=n,mod;
//	while(x/10)
//	{
//		mod=x%10;
//		x=x/10;
//		if((x%10)==mod-1||(x%10)==mod+1)
//			return false;	
//	}
//	return true;
//}
//bool IsKnum(int &i,int &k)
//{
//	int x=i,mod;
//	while(x)
//	{
//		mod=x%10;
//		if(mod>=k)
//			return false;
//		x=x/10;
//	}
//	return true;
//}
bool IsK(int a[],int alen)
{
	for(int m=0;m<alen;m++)
		{
			if(a[m]==a[m+1]-1||a[m]==a[m+1]+1)
				return false;
		}
		return true;
}
int main()
{
	int K,L,count=0;
	cin>>K>>L;
	int arr[L]={0};
	for(int m=1;m<K;m++)
	{
		arr[L-1]=m;
		for(int i=0;i<L-1;i++)
		{
			for(int j=0;j<K;j++)
			{
				arr[i]=j;
				if(IsK(arr,L))
					count++;
			}
		}
	}
	
//	for(int i=pow(10,L-1);i<pow(10,L);i++)
//	{
//		if(IsK(i)&&IsKnum(i,K))
////			cout<<i<<" ";
//			count++;
//	}
	cout<<count%1000000007;
	return 0;
}




