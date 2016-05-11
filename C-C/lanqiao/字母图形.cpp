#include"iostream"

using namespace std;
void nlewm(int n,int m)     //当n小于m时，打印题意中的规律字母 
{   int k1,k2;
 	for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i!=0)
				{
					for(k1=0;k1<=i+j;k1++)
					{
						cout<<(char)('A'+i+j-k1);
					}
					for(k2=0;k2<(m-k1);k2++)
					{
						cout<<(char)('B'+k2);	
					}break;
				}
				else
				cout<<(char)('A'+j);
			}cout<<endl;
		}
}
int main()
{
	int n,m,k3,x;
	cin>>n>>m;
	x=n/m;
	n%=m;
	if(x==0)
		nlewm(n,m);
	else{
			for(k3=0;k3<x;k3++)
			{
				nlewm(m,m);	
			}
		    nlewm(n,m);
		}
	return 0;
 } 
