//历届试题  回文数    20160309  By Vicebery 
//问题描述
//　　观察数字：12321，123321 都有一个共同的特征，无论从左到右读还是从右向左读，都是相同的。这样的数字叫做：回文数字。
//
//　　本题要求你找到一些5位或6位的十进制数字。满足如下要求：
//　　该数字的各个数位之和等于输入的整数。
//输入格式
//　　一个正整数 n (10<n<100), 表示要求满足的数位和。
//输出格式
//　　若干行，每行包含一个满足要求的5位或6位整数。
//　　数字按从小到大的顺序排列。
//　　如果没有满足条件的，输出：-1
//样例输入
//44
//样例输出
//99899
//499994
//589985
//598895
//679976
//688886
//697796
//769967
//778877
//787787
//796697
//859958
//868868
//877778
//886688
//895598
//949949
//958859
//967769
//976679
//985589
//994499
//样例输入
//60
//样例输出
//-1
#include"iostream"
using namespace std;
int NegNum(int a)
{
	int mod,result=0;
	while(a)
	{
		mod=a%10;
		a/=10;
		result=result*10+mod;
	}
	return result; 
} 
int Sum(int a)
{
	int sum=0,mod;
	while(a)
	{
		mod=a%10;
		a/=10;
		sum+=mod;
	}
	return sum;
}
bool prin(int n)
{
	int count=0;
	for(int i=10000;i<=999999;i++)
	{
		if(i==NegNum(i)&&n==Sum(i))
		{
		 	cout<<i<<endl;
			 count++;	
     	}
	}
	if(count!=0)
		return true;
	else return false;
}
int main()
{
	int n;
	cin>>n;
	
	if(prin(n));
	else cout<<-1;
	return 0;
}
