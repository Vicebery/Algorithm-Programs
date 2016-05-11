#include <stdio.h> 
#define MAXN 20 
void CountOff( int n, int m, int out[] ); 
int main() 
{ 
   int out[MAXN], n, m;
    int i;
	scanf("%d %d", &n, &m);    
	CountOff( n, m, out );        
	for ( i = 0; i < n; i++ )       
		printf("%d ", out[i]);    
	printf("\n"); 
	return 0; 
}
 /* 你的代码将被嵌在这里 */
void CountOff( int n, int m, int out[] )
{
	int a[n+1],i;
	for(i=1;i<=n;i++)
		a[i]=i;
	int count=0,h=1,N=1;
	while(N!=n+1)
	{
		if(h==n+1)
			h=1;
		if(a[h]>0)
		{  
			count++;	
		}
		if(count==m)
		{
			out[h-1]=N;
			N++;
			a[h]=-1;
			count=0;
		}
		h++;
	}
}
