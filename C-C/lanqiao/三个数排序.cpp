//三个数排序，从大到小
#include"iostream"
using namespace std;
int main()
{
	int a[3],temp;
	for(int i=0;i<3;i++)
		cin>>a[i];
	for(int i=0;i<2;i++)
	{	
		if(a[i]<a[i+1])
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i=-1;
		}
	}
	for(int i=0;i<3;i++)
		cout<<a[i]<<" ";
	return 0;
 } 
