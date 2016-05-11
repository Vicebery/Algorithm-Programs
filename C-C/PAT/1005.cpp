#include"iostream"
using namespace std;
typedef struct xn
{
	int x;
	int xn[100];
	int xnlen;
	int flag;
}N;
void InsertSort(int f[] ,int n)
{
	for(int i=1;i<n;i++)
	{
		int j=0;
		short temp=f[i];
		for( j=i-1;j>=0&&f[j]>temp;j--)
		{
			f[j+1]=f[j];
		}
		f[j+1]=temp;
	}
}
int main()
{
	int n;
	cin>>n;
	N a[n];
	for(int i=0;i<n;i++)
		cin>>a[i].x;
	for(int i=0;i<n;i++)
	{
		int y=a[i].x;
		int j=0;
		while(y!=1)
		{
			if(y%2==0)
			{
				y/=2;
				a[i].xn[j++]=y;
			}
			else
			{
				y=(y*3+1)/2;
				a[i].xn[j++]=y;
			}
		}
		a[i].flag=0;
		a[i].xnlen=j;
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i!=j)
			{
				for(int k=0;k<a[j].xnlen;k++)
				{
					if(a[i].x==a[j].xn[k])
						a[i].flag=1;
				}	
			}
		}	
	}
	int x[n],m=0;
	for(int i=0;i<n;i++)
	{
		if(a[i].flag!=1)
			x[m++]=a[i].x;
	}
	InsertSort(x,m);
	for(int i=m-1;i>=0;i--)
	{
		if(i==0)
			cout<<x[0];
		else
			cout<<x[i]<<" ";
	}
	return 0;
}
