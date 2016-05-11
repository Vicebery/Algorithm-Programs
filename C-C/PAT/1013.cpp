//@@Author: Vicebery
//@@Date : 20160407

#include"iostream"
#include"cmath"
using namespace std;
bool IsPrimeNum(int );
int main()
{
	int M,N,count=0,tag=0;
	cin>>M>>N;
	for(int i=2;;i++)
	{
		if(IsPrimeNum(i))
		{
			
			count++;
			if(count>=M&&count<N)
			{	
				tag++;
				if(tag%10==0)
					cout<<i<<endl;
				else
					cout<<i<<" ";
			}
			if(count==N)
			{
				cout<<i;
				break;
			}
		}	
		
	}
	return 0;
}
bool IsPrimeNum(int n)
{
	if(n==2||n==3) return true;
	for(int i=2;i<=sqrt(n);i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
