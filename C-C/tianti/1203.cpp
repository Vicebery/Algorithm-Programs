#include"iostream"
#include"cmath"
using namespace std;
#define MinS 0.00000001
int main()
{
	double a,b;
	cin>>a>>b;
	if(abs(a-b)<=MinS)
		cout<<"yes";
	else cout<<"no";
	return 0;
}
