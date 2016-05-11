#include"iostream"
using namespace std;
long long GetP(long long , int );
int main()
{
	long long A,B;
	int DA,DB;
	cin>>A>>DA>>B>>DB;
	cout<<GetP(A,DA)+GetP(B,DB);	
	return 0;
} 
long long GetP(long long n, int x)
{
	int result=0,count=0;
	while(n!=0)
	{
		if(n%10==x)
			count++;
		n/=10;
	}
	while(count!=0)
	{
		result=x+result*10;
		count--;	
	}	
	return result;
} 
