#include<stdio.h>
#define N 10
void main()
{
	int i,j,n,b[N][N];
	void yanghui(int a[][N],int n);
	printf("Enter n:");
	scanf("%d",&n);
	yanghui(b,n);
	for(i=0;i<n;i++)
	{
		for(j=0;j<=i;j++)
			printf("%-4d",b[i][j]);
		printf("\n");
	}
}
void yanghui(int a[][N],int n)
{
	int i,j;
	for(i=0;i<n;i++)
	{a[i][0]=1;
	a[i][i]=1;
	}
	for(i=2;i<n;i++)
		for(j=1;j<i;j++)
			a[i][j]=a[i-1][j-1]+a[i-1][j];
}
