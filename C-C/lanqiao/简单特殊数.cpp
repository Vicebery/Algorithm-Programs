#include"iostream"
using namespace std;
bool IsN(int n)
{
	int mod,a=n,sum=0;
	while(a)
	{
		mod=a%10;
		a/=10;
		sum+=mod*mod*mod;
	}
	if(sum==n)
	return true;
	else return false;
}
int main()
{
	for(int i=100;i<1000;i++)
	{
		if(IsN(i))cout<<i<<endl;
	}
	return 0;
}
