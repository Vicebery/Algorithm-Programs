//@@Vicebery
//@@20160329

#include"iostream"
using namespace std;
int main()
{
	int n,m;
	cin>>n>>m;
	int a[n],b[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
		int j=(i+m)%n;
		b[j]=a[i];
	}
	for(int i=0;i<n;i++)
	{
	 	if(i==n-1)
		 	cout<<b[n-1];
		else 
			cout<<b[i]<<" ";	
	}
	return 0;
}
