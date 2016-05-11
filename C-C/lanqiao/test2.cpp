#include"iostream"
//#include"string.h"
using namespace std;
int main()
{
	string a,b;
	cin>>a>>b;
	cout<<"a="<<a<<endl<<"b="<<b; 
	if(a>b)
		cout<<"a-b="<<a[a.length()-1]-b[b.length()-1];
	return 0;
}
