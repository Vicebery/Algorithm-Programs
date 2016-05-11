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
int main()
{
	for(int i=1000;i<=9999;i++)
	{
		if(i==NegNum(i)) cout<<i<<endl;
	}
	return 0;
}
