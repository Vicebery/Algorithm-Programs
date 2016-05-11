#include<string>
#include<iostream>
#include<cstring>
#include<algorithm>
#include<cstdio>
using namespace std;
const int MaxSize=100;
bool WordPrint(char s[], int top, int end)
{
	if(top>end)
		return false;
	for(int i=top;i<=end;i++)
	{
		cout<<s[i];
	}
	return true;
}
int main()
{	
	char s[MaxSize];
	int  blank_tag[MaxSize];
	cin.getline(s,MaxSize);
	int j=1;
	for(int i=0;i<strlen(s)-1;i++)
	{
		 if(s[i]==' ')
		 	blank_tag[j++]=i;
	}
	if(s[strlen(s)-1]==' ') 
		blank_tag[j]=strlen(s)-1;
	else  blank_tag[j]=strlen(s);
	for(int ii=j;ii>1;ii--)
	{
		WordPrint(s,blank_tag[ii-1]+1,blank_tag[ii]);	
	}
	WordPrint(s,0,blank_tag[1]);		
	return 0;
}
