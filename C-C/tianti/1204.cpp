#include"iostream"
#include"cstring"
#define MaxSize 101
using namespace std;
int func(char a[], char b[], int alen, int blen)
{
	int location;
	for(int i=0;i<alen;i++)
	{
		location=i+1;
		int count=0,j=0;
		if(a[i]==b[j])
		{		
			while(j<blen)
			{
				if(a[i+j]==b[j])
				{
					count++;
					++j;	
				}
				else
				{
					count=0;
					break;
				}		
			}	
		}
		if(count==blen)
			return location;
	}
}
int main()
{
	char a[MaxSize],b[MaxSize];
	cin>>a>>b;
	cout<<func(a,b,strlen(a),strlen(b));
	return 0;	
}
