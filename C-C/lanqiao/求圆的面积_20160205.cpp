//eg����뾶Ϊr��Բ����� �����������С�������λ������������� 
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
//	cout<<fixed<<setprecision(7)<<PI*r*r;   Ҳ��������һ��ʵ�� 
	return 0;	
}
