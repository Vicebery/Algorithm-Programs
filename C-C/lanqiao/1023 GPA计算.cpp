//1023 GPA¼ÆËã
#include"iostream"
#include"iomanip"
using namespace std;
int main()
{
	int n;
	cin>>n;
	double a[n][2],suma=0,sumb=0;
	for(int i=0;i<n;i++)
		for(int j=0;j<2;j++)
			cin>>a[i][j];
	for(int i=0;i<n;i++)
	{
		suma+=a[i][0];
		sumb+=a[i][0]*a[i][1]; 
	} 
	cout<<fixed<<setprecision(2)<<sumb/suma;
	return 0;
 } 
