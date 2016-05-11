#include <stdio.h>
int fn( int a, int n ); 
int SumA( int a, int n );
int main() 
{    
	int a, n;    
  	scanf("%d %d", &a, &n);   
   	printf("fn(%d, %d) = %d\n", a, n, fn(a,n));    
    printf("s = %d\n", SumA(a,n));    
    return 0; 
} 
/* 你的代码将被嵌在这里 */ 
int fn(int a, int n)
{
	int result=0;
	while(n>0)
	{
		result=result*10+a;
		n--;
	}
	return result;
}
int SumA(int a, int n)
{
	int result=0,sum=0;
	while(n>0)
	{
		result=result*10+a;
		n--;
		sum+=result;
	}
	return sum;
}
