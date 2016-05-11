#include"stdio.h"
int main()
{
	char word,nextword;
	int n;
	scanf("%c",&word);
	scanf("%d",&n);
	if(n==1)
	{
		printf("%c",word);
		return 0;
	}
	int count=0,a,i;
	a=(n-1)/2;
	for(i=1;i<=a;i++)
		printf(" ");
	printf("%c\n",word);
	while(count!=a)
	{
		count++;
		for(i=1;i<=a-count;i++)
			printf(" ");
		printf("%c",(char)(word+count));
		for(i=1;i<=2*count-1;i++)
			printf(" ");
		printf("%c\n",(char)(word+count));
	}
	while(count!=1)
	{
		count--;
		for(i=1;i<=a-count;i++)
			printf(" ");
		printf("%c",(char)(word+count));
		for(i=1;i<=2*count-1;i++)
			printf(" ");
		printf("%c\n",(char)(word+count));
	}
	for(i=1;i<=a;i++)
		printf(" ");
	printf("%c",word);
	return 0;
}
