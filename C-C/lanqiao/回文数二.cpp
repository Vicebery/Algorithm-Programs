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
int main()
{
	int n;
	cin>>n;
	
	for(int i=10000;i<=999999;i++)
	{
		if(i==NegNum(i)&&n==Sum(i))
		 	cout<<i<<endl;
	}
	return 0;
}
