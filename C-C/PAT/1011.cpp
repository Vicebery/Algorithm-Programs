//@@Author: Vicebery
//@@Date : 20160407

#include"iostream"
using namespace std;
bool TestABC(long long a, long long b, long long c)
{
	if(a+b>c)
		return true;
	else 
		return false;
}
int main()
{
	int n;
	cin>>n;
	long long a[n][3];
	for(int i=0;i<n;i++)
	{
		cin>>a[i][0]>>a[i][1]>>a[i][2];	
	}
	for(int i=0;i<n;i++)
	{
		cout<<"Case #"<<i+1<<": ";
		if(TestABC(a[i][0],a[i][1],a[i][2]))
			cout<<"true";
		else cout<<"false";
		cout<<endl;
	}	
	return 0;
} 
