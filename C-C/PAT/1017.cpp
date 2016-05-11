#include"iostream"
#include"cstring"
using namespace std;
const int Maxlen=1001;
int main()
{
	char A[Maxlen];
	int C[Maxlen]={0},k=0,mod=0,y;
	int B;	
	cin>>A;
	cin>>B;
	for(int i=0;i<strlen(A);i++)
	{
		y=mod*10+(A[i]-'0');
		if(i==0&&y/B==0);
		else
			cout<<y/B;
		if(y>=B)
		{
			C[k]=y/B;
		}
		else
			C[k]=0;
		mod=y%B;
		k++;
	}

	cout<<" "<<mod;
	return 0;
} 
