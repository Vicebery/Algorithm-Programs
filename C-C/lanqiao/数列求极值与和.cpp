#include"iostream"
using namespace std;
int main()
{
	short n;
	cin>>n;
	
	int sum=0;
	short a[n],temp=0;
	
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
		sum+=a[i];
	}
	for(int i=0;i<n;i++)
	{
		if(a[0]>a[i])
		{
			temp=a[0];
			a[0]=a[i];
			a[i]=temp;
		}
	}
	for(int i=0;i<n;i++)
	{
		if(a[n-1]<a[i])
		{
			temp=a[n-1];
			a[n-1]=a[i];
			a[i]=temp;
		}
	
	}
	cout<<a[n-1]<<endl<<a[0]<<endl<<sum;
	return 0;
}
