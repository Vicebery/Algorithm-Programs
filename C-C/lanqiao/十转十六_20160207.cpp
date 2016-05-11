#include"iostream"

using namespace std;
char tohex(int n)
{
    if(n>=10 && n<=15)
    {
    	return 'A'+n-10;
    }
    return '0'+n;
}
void DecToHex(long a)
{
	int i=0,j,mod;
	char result[10];
	if(a==0)cout<<0;
	else
	{
		while(a)
		{
			mod=a%16;
			result[i++]=tohex(mod);
			a=a/16;	
		}
		for(j=i-1;j>=0;j--)
		{
			cout<<result[j];	
		}
	}
} 
int main()
{
	long a;
	cin>>a;
	DecToHex(a);
	return 0;
}
