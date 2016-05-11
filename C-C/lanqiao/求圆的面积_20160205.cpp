//eg：求半径为r的圆的面积 ；输出：保留小数点后七位，四舍五入输出 
#include"iostream"
#include"iomanip"

using namespace std;
int main()
{
	const double PI=3.14159265358979323;
	int r;
	cin>>r;
	cout.setf(ios::fixed);     
	cout<<setprecision(7)<<PI*r*r;
//	cout<<fixed<<setprecision(7)<<PI*r*r;   也可以这样一行实现 
	return 0;	
}
