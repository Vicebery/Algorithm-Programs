//20160315  By Vicebery 
//问题描述
//　　编写一个程序，读入一组整数，这组整数是按照从小到大的顺序排列的，它们的个数N也是由用户输入的，最多不会超过20。然后程序将对这个数组进行统
//计，把出现次数最多的那个数组元素值打印出来。如果有两个元素值出现的次数相同，即并列第一，那么只打印比较小的那个值。
//　　输入格式：第一行是一个整数N，N? ￡? 20；接下来有N行，每一行表示一个整数，并且按照从小到大的顺序排列。
//　　输出格式：输出只有一行，即出现次数最多的那个元素值。
//输入输出样例
//样例输入
//5
//100
//150
//150
//200
//250
//样例输出
//150
#include"iostream"
using namespace std;
bool func(int a[][2],int N)
{
	if(N<=0)
		return false;
	for(int i=0;i<N;i++)
	{
		for(int j=i+1;j<N;j++)
		{
			if(a[i][0]==a[j][0])
				a[i][1]++;
		 } 
	}
	for(int i=0;i<N;i++)
	{
		int count=0;
		for(int j=i+1;j<N;j++)
		{
			
			if(a[i][1]>=a[j][1])
				count++;
			if(count==(N-j))
			{
				cout<<a[i][0];
				return true;
			}		
		}
	}            
}
int main()
{
	int N;
	cin>>N;
	int a[N][2]={(0,0)};
	for(int i=0;i<N;i++)
	{
		cin>>a[i][0];
	}
	func(a,N);
	return 0;
}

