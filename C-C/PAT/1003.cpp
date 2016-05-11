//@@author: Vicebery
//@@date : 20160324

#include"iostream"
#include"cstring"
using namespace std;
bool IsPAT_1(char a[], int a_len)
{
	for(int i=0;i<a_len;i++)
	{
		if(a[i]!='P'&&a[i]!='A'&&a[i]!='T')
			return false;
	}
	return true;
}
bool IsPAT_2(char a[], int a_len)
{
	int n=a_len;
	if(!IsPAT_1(a,n)||n%2==0||n<3) 
		return false;
	if(n==3&&a[0]=='P'&&a[1]=='A'&&a[2]=='T')
		return true;
	for(int i=0,j=n-1;i<(n-3)/2;i++,j--)
	{
		if(a[i]!=a[j]||a[i]!='A')
			return false;
	}
	if(!(a[(n-3)/2]=='P'&&a[(n-3)/2+1]=='A'&&a[(n-3)/2+2]=='T'))
		return false;
	return true;
}
bool IsPAT_3(char a[], int a_len)
{
	int n=a_len;
	if(!IsPAT_1(a,n)||n<4)
		return false;
	if(n>=4)
	{	
		int a_i=0,a_j=0,a_k=n-1;
		while(a[a_i]!='P')
		 	a_i++;
		while(a[a_j]!='T')
		    a_j++;
		while(a[a_k]!='T')
		    a_k--;
		int headA=a_i,midA=a_j-a_i-1,backA=n-a_k-1;  
		if(backA==headA*midA)  
		{
			if(midA==0) return false;
			for(int i=0;i<n;i++)
			{
				if(i==a_i||i==a_j)
					continue;	
				if(a[i]!='A')
					return false;
			}
			return true;
		}
		return false;
	}
}
int main()
{
	int n;
	cin>>n;
	char s[n][101];
	for(int i=0;i<n;i++)
	{
		cin>>s[i];
	}
	for(int i=0;i<n;i++)
	{
		if(!IsPAT_1(s[i],strlen(s[i])))
			cout<<"NO";
		else{
				if(IsPAT_2(s[i],strlen(s[i])))
					cout<<"YES";
				else if(IsPAT_3(s[i],strlen(s[i])))
						cout<<"YES";
					else cout<<"NO";
			}
		cout<<endl;
	}
	return 0;
}
