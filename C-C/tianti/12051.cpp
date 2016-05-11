#include<string>
#include<iostream>
#include<cstring>
#include<algorithm>
#include<cstdio>
using namespace std;
string a[100];
int main()
{
	int i=1;
	while(cin>>a[i]&&getchar()==32)
	{
		i++;
	}
	for(int j=i;j>1;j--)
	{
		cout<<a[j]<<" ";	
	}
	cout<<a[1];
	return 0;
}
