#include"iostream"
#include"cstdio"

//int a[1000000][2];
int main()
{	
	using namespace std;
	int N;
	scanf("%d",&N);
	int a[N];
	for(int i=0;i<N;i++)
	{
		scanf("%d",&a[i]);
	}
	int end=N-1;
	for(int j=0;j<=end;j++)
	{
		int count=1;
		for(int k=j+1;k<=end;k++)
		{
			if(a[j]==a[k])
			{
				count++;
				if(k!=end)
				{
					a[k]=a[end--];		//不需交换，直接覆盖 
					k--;
				}
				else end--;
			}
		}
		if(count%2==1)
		{
			printf("%d",a[j]);
			break;
		}
	}
	return 0;
}
