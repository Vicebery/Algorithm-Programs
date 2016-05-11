#include"iostream"
using namespace std;
int main()
{
	int n,min,max;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
		cin>>a[i];
		min=max=a[0];
	for(int i=0;i<n;i++)
	{
		if(min>=a[i])
			min=a[i];
		if(max<=a[i])
			max=a[i];
	}	
	cout<<min<<" "<<max;
	return 0;
} 
