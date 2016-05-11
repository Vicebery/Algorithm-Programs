#include"iostream"
#include"cstring"

using namespace std;
long long HexToDec(char a[] , int n)
{
	long long sum=0;
	int t,i;
	for(i=0;i<n;i++)
	{
		if(a[i]<='9')t=a[i]-'0';
		else t=a[i]-'A'+10;
		sum=sum*16+t;
	}
	return sum;
}
int main()
{

	char a[9];
	cin>>a;
	
	cout<<HexToDec(a,strlen(a))<<endl;
	
	return 0;
}
