/*Author: Vicebery
 *Date: 20160427
 *About: PAT_5_1
 */
#include"stdio.h"
#define MaxSize 20
int main()
{
	int m,n;
	int a[MaxSize],b[MaxSize];

	scanf("%d",&m);
	for(int i=0;i<m;i++)
		scanf("%d",&a[i]);
		
	scanf("%d",&n);
	for(int i=0;i<n;i++)
		scanf("%d",&b[i]);
		
	int c[MaxSize],flag,flagg,k1=0,k2=0;
	for(int i=0;i<m;i++)
	{
		flag=0,flagg=0;
		for(int j=0;j<k1;j++)
		{
			if(a[i]==c[j])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			continue;
		for(int ii=0;ii<n;ii++)
		{
			if(a[i]==b[ii])
			{
				flagg=1;
				break;	
			}
		}
		if(flagg==0)
			c[k1++]=a[i]; 
	}
	for(int i=0;i<k1;i++)
		printf("%d ",c[i]);
		
	for(int i=0;i<n;i++)
	{
		flag=0,flagg=0;
		for(int j=0;j<k2;j++)
		{
			if(b[i]==c[j])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			continue;
		for(int ii=0;ii<m;ii++)
		{
			if(b[i]==a[ii])
			{
				flagg=1;
				break;	
			}
		}
		if(flagg==0)
			c[k2++]=b[i]; 
	}	
	for(int i=0;i<k2;i++)
	{
		if(i==k2-1)
			printf("%d",c[i]);
		else 
			printf("%d ",c[i]);
	}
	return 0;
}
