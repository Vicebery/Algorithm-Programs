#include"iostream"
using namespace std;
void FFish(int , int , int , int );
int main()
{
	int a,b,c,d;
	cin>>a>>b>>c>>d;
	FFish(a,b,c,d);
	return 0;
}
void FFish(int a, int b, int c, int d)
{
	if(a-b<0&&b-c<0&&c-d<0)
	{
		cout<<"Fish Rising";
		return ;
	}
		
	if(a-b>0&&b-c>0&&c-d>0)
	{
		cout<<"Fish Diving";
		return ;
	}
	if(a==b&&b==c&&c==d)
	{
		cout<<"Fish At Constant Depth";
		return ;
	}
	cout<<"No Fish";
}
