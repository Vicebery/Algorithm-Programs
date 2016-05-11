#include"iostream"
using namespace std;
const int N=34;
void yanghui(long a[][N],int n)
{
	int i,j;
	for(i=0;i<n;i++)
	{	
		a[i][0]=1;
		a[i][i]=1;
	}
	for(i=2;i<n;i++)
	{
		for(j=1;j<i;j++)
		{
			a[i][j]=a[i-1][j-1]+a[i-1][j];
		}
	}
}
int main()
{
	int n;
	long a[N][N];
	cin>>n;
	
	yanghui(a,n);
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			cout<<a[i][j]<<" ";
		}
		cout<<endl;
	}
	return 0;
}
