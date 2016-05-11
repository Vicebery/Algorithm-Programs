#include"iostream"
using namespace std;
int func(int a[],int head,int end)
{
	if(head==end)
		return 0;
	else{
			int count=0;
			for(int i=head;i<end;i++)
	 			if(a[head-1]>a[i])
					count++;	
		 	return	count+=func(a,head+1,end) ;	
		}
}
int main()
{
	int n;
	cin>>n;
	
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	cout<<func(a,1,n);
	return 0;
}
