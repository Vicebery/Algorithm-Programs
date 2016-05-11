///单个字符相加减，运算结果默认转换为int类型 
#include"iostream"
using namespace std;
int main()
{
	char a='9',b='2';				
//	cin>>a>>b;
	cout<<"sizeof(a)="<<sizeof(a)<<endl;
	cout<<"sizeof(int)="<<sizeof(int)<<endl;
	
	cout<<"a+b="<<a+b<<endl; 
	cout<<"sizeof(a+b)="<<sizeof(a+b)<<endl;
	
	cout<<"a-b="<<a-b<<endl; 
	cout<<"sizeof(a-b)="<<sizeof(a-b)<<endl;
	
	return 0;
 } 
