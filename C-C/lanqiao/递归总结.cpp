//#include"stdio.h"
#include"iostream"
using namespace std;
int Fib(int n)
{
	if(n==1||n==2)
		return (1);
	else
		return(Fib(n-1)+Fib(n-2));
}
int fun(int n)
{
	if(n==1)
		return (1);
	else 
		return (fun(n-1)*n);
}
void Hanoi(int n,char X,char Y,char Z)
{
	if(n==1)
		printf("\t将第%d个盘片从%c移动到%c\n",n,X,Z);
	else 
		{
			Hanoi(n-1,X,Y,Z);
			printf("\t将第%d个盘片从%c移动到%c\n",n,X,Z);
			Hanoi(n-1,Y,X,Z);
		}
}
int main()
{
	int n;
	cin>>n;
	cout<<Fib(n)<<endl<<fun(n);
	return 0;
}
