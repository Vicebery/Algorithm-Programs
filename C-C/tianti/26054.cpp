#include"iostream"
#include"cstdio"
int main()
{
	int N,x,ans=0;
	scanf("%d",&N);
	for(int i=0;i<N;i++)
	{
		scanf("%d",&x);
		ans^=x;	
	} 
	printf("%d",ans);
	return 0;
}
