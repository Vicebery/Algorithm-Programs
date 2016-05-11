//@@运行超时 
//@@判断素数提高效率----素数筛选法 
 
#include"iostream"
using namespace std;
bool IsPrime(int n)
{
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		 	return false;
	}
	return true;
}
int main()
{
	int n,count=0;
	cin>>n;
	for(int i=3;i<=n;i=i+2)
	{
		if(i+2<=n)
		{
			if(IsPrime(i)&&IsPrime(i+2))
				count++;
		}
	}
	cout<<count;
	return 0;
} 
