#include"iostream"
#include"cstring"
#include"math.h"
using namespace std;
long HexToDec(char a[] , int n)
{
	long sum=0;
	int t,i;
	for(i=0;i<n;i++)
	{
		if(a[i]<='9')t=a[i]-'0';
		else t=a[i]-'A'+10;
		sum=sum*16+t;
	}
	return sum;
}
long long DecToOct(long num)
{ 
    long long sum=0;
	int x,n=0;
	if(num<8)sum=num;
	else{
	
	    	while(num>=8)
	    	{
	    		x=num%8;
		    	num=num/8;
		    	sum=sum+x*pow(10,n);
		    	n++;
	    	}
	    	sum=sum+num*pow(10,n);
	    }
	    return sum;
}
int main()
{
	int n;
	cin>>n;
	char a[n][7];
	
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(int i=0;i<n;i++)
	{
		cout<<DecToOct(HexToDec(a[i],strlen(a[i])))<<endl;
	}
	return 0;
}
