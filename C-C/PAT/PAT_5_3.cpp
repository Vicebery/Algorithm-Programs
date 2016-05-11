/*Author: Vicebery
 *Date: 20160428
 *About: 5-3
 */
 
#include"stdio.h"
void print(char word, int n);
int main()
{
	char word;
	int n;
	scanf("%c",&word);
	scanf("%d",&n);
	print(word,n);
	return 0;
} 
void print(char word, int n)
{
	if(word<'A'||word>'G'||n%2==0||n<=0||n>10)
	{
		printf("Input illegal !");
		return ;
	}
	if(n==1)
	{
		printf("%c",word);
		return ;
	}
	int count=0,a;
	a=(n-1)/2;
	for(int i=1;i<=a;i++)
		printf(" ");
	printf("%c\n",word);	
	while(count!=a)
	{
		count++;
		for(int i=1;i<=a-count;i++)
			printf(" ");
		printf("%c",char(word+count));
		for(int i=1;i<=2*count-1;i++)
			printf(" ");
		printf("%c\n",char(word+count));
	}
	while(count!=1)
	{
		count--;
		for(int i=1;i<=a-count;i++)
			printf(" ");
		printf("%c",char(word+count));
		for(int i=1;i<=2*count-1;i++)
			printf(" ");
		printf("%c\n",char(word+count));
	}
	for(int i=1;i<=a;i++)
		printf(" ");
	printf("%c",word);
} 
