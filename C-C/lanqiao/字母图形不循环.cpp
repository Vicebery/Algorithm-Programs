#include"iostream"
using namespace std;
int main()
{
	 int n,m,k1,k2;
	 cin>>n>>m;
	 
 	for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i!=0)
				{
					for(k1=0;k1<=i+j&&k1<m;k1++)
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
	return 0;
}
