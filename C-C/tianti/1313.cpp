//@@Author: Vicebery
//@@Date: 20160410

#include"iostream"
#include"cmath"
using namespace std;
int FindMaxZS(int );
bool Isprime(int );
int main()
{
	int n;
	cin>>n;
	cout<<FindMaxZS(n);
	return 0;	
}
bool Isprime(int n)
{
	for(int i=2;i<=sqrt(n);i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
int FindMaxZS(int n)
{
	if(n%2==0)
		return n/2;
	for(int i=3;i<sqrt(n);i=i+2)
	{
		if(Isprime(i)&&(n%i==0))
			return n/i;
	}
}
