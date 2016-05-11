#include"iostream"
#include"cstring"
using namespace std;
void NumToWord(int n)
{
	switch(n)
	{
		case 0: cout<<"ling";break;
		case 1: cout<<"yi";break;
		case 2: cout<<"er";break;
		case 3: cout<<"san";break;
		case 4: cout<<"si";break;
		case 5: cout<<"wu";break;
		case 6: cout<<"liu";break;
		case 7: cout<<"qi";break;
		case 8: cout<<"ba";break;
		case 9: cout<<"jiu";break;
		default : cout<<"error ! ";
	}
}
void print(int x)
{
	int a[100],count=0,i=0;
	while(x)
	{
		a[i++]=x%10;
		x/=10;
	}
	for(int j=i-1;j>=0;j--)
	{
		if(j==0)
			NumToWord(a[j]);
		else{
				NumToWord(a[j]);
				cout<<" ";
			}
	}
}
int main()
{
	char a[101];
	cin>>a;
	int sum=0;
	for(int i=0;i<strlen(a);i++)
	{
		sum+=(a[i]-'0');
	}
	print(sum);
	return 0;
}
