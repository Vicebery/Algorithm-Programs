#include"iostream"

using namespace std;
int main()
{
	short F[1000000];
	F[1]=1;
	F[2]=1;
	long n;
	cin>>n;
	
	for(long i=3;i<=n;i++)
	{
		F[i]=(F[i-1]%10007+F[i-2]%10007)%10007;
	}
	cout<<F[n]<<endl;
	return 0;
}


