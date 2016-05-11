//20160310 By Vicebery
//问题描述
//　　斐波那契数列大家都非常熟悉。它的定义是：
//　　f(x) = 1 .... (x=1,2)
//　　f(x) = f(x-1) + f(x-2) .... (x>2)
//　　对于给定的整数 n 和 m，我们希望求出：
//　　f(1) + f(2) + ... + f(n) 的值。但这个值可能非常大，所以我们把它对 f(m) 取模。
//　　公式如下
//
//
//　　但这个数字依然很大，所以需要再对 p 求模。
//输入格式
//　　输入为一行用空格分开的整数 n m p (0 < n, m, p < 10^18)
//输出格式
//　　输出为1个整数，表示答案
//样例输入
//2 3 5
//样例输出
//0
//样例输入
//15 11 29
//样例输出
//25
#include"iostream"
using namespace std;

long long Fibonacci(long long n)
{
	long long fir=1,sec=1,result=0;
	
	if(n==1||n==2)result=1;
	else{
			for(int i=2;i<n;i++)
			{
				result=fir+sec;
				fir=sec;
				sec=result;
			}
		}
	return result;
}
int main()
{
	long long n,m,p,sum=0;
	cin>>n>>m>>p;
	if(n%2==0)
	{
		for(int i=3;i<=n+1;i=i+2)
		{
			sum+=(Fibonacci(i)%Fibonacci(m));
		}
	}
	else{
			for(int i=3;i<=n;i=i+2)
			{
				sum+=(Fibonacci(i)%Fibonacci(m));
			}
			sum+=(Fibonacci(n)%Fibonacci(m));		
		}
	cout<<sum%Fibonacci(m)%p;
	return 0;
}
