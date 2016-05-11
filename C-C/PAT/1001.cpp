#include"iostream"
using namespace std;
int count=0;
bool func(int x)
{
	if(x<=0)	return false;
	if(x==1)	return true;
	count++;
	if(x%2==0)
		func(x/2);
	else func((3*x+1)/2);
}
		
int main()
{
	int n;
	cin>>n;
	func(n);
	cout<<count;
	return 0;
}
