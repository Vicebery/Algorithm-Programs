#include"iostream"

void InsertSort(short f[] ,int n)
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
	using namespace std;
	
	int n;
	cin>>n;
	
	short F[n];
	for(int i=0;i<n;i++)
	{
		cin>>F[i];
	}
	
	InsertSort(F,n);
	
	for(int i=0;i<n;i++)
	{
		cout<<F[i]<<" ";
	}
	return 0;
 } 
 
