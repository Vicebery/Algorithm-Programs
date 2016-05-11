#include"iostream"
using namespace std;
int *func(int *p)		//返回指针后其后续地址还存在否？？？ 
{
	for(int i=0;i<10;i++)
	{
		p[0]=2*i;
	}
	return p;
}
int main() 		
{
	int *a,*b;
	b=func(a);
//	for(int i=0;i<10;i++)
//	{
		cout<<"Num "<<1<<": "<<*b<<" ";
//	}
	return 0;
} 
