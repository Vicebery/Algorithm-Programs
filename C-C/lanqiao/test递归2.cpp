//#include<stdio.h>
#include"iostream"
#include"string"
using namespace std;
//void up_and_down(int);
string recfun2(int );
int func(int i)
{
	if(i<=0)
		return 0;
	else if(i<=2)
			return 1;
		else return func(i-1)+func(i-2);
 } 

 void hanoi(int n,int p1,int p2,int p3)
{
	if(1==n)
		cout<<"盘子从"<<p1<<"移到"<<p3<<endl;
	else
	{
		hanoi(n-1,p1,p3,p2);
		cout<<"盘子从"<<p1<<"移到"<<p3<<endl;
		hanoi(n-1,p2,p1,p3);
	}
}
int main(void)
{
//   int n,m;
//   cin>>n>>m;
//   for(int i=n;i<=m;i++)
//	{
//		string s=recfun2(i);
//		cout<<i<<"="<<s<<endl;	
//	}
	int n,p1,p2,p3;
	cin>>n>>p1>>p2>>p3;
	hanoi(n,p1,p2,p3);
	//	cout<<func(n);
   return 0;
}
//void up_and_down(int n)
//{
//    printf("Level %d:n location %p\n",n,&n); /* 1 */
//    if(n<4)
//      up_and_down(n+1);
//    printf("Level %d:n location %p\n",n,&n); /* 2 */
//}
string recfun2(int n)
{
	for(int i=2; i<n; ++i)
	{
		if(n%i == 0)
		{
			return i + "*" + recfun2(n/i);
		}
	}
	return ""+n;
}
