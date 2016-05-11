#include"iostream"
using namespace std;
int main()
{
	short n;
	cin>>n;
	
	short f[n];
	for(int i=0;i<n;i++)
	{
		cin>>f[i];
	}
	
	short a,i;
	cin>>a;
	
	for(i=0;i<n;i++)
	{
		if(a==f[i])
		{
			cout<<i+1;
			break;
		}
	}
	if(i==(n))cout<<-1;
	return 0;
}
