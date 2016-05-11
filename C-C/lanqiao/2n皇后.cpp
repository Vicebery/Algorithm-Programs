#include"iostream"
using namespace std;

const int MaxSize=20;
int a[MaxSize]={0};
int count=0; 
bool IsSuit(int y)
{
	for(int i=1;i<y;i++)
	{
		if(a[i]==a[y]||a[i]-a[y]==i-y||a[i]-a[y]==y-i)
			return false;	
	}	
	return true;
} 
void Nqueen(int n)
{
	int x=1;
	a[x]=1;
	while(x>0)
	{
		if(x<=n&&a[x]<=n)
		{
			if(IsSuit(x))
			{
				x++;
				a[x]=1;
			}
			else
			{
				a[x]++;
			}
		}
		else
		{
			if(x>n)
			{
				count++;	
			}
			x--;
			a[x]++;	
		} 
	}
}
int main()
{
	int n;
	cout<<"Please input N : ";
	cin>>n; 
	Nqueen(n);	
	cout<<count;
	return 0;
} 
