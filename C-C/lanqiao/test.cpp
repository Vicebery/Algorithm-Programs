#include <iostream>
int main()
{
	using namespace std;
	int len;
	cin>>len;
	int *p = new int [len];
	for(int i=0;i<len;i++)
	{
		cin>>p[i];
	}
	for(int i=0;i<len;i++)
	{
		cout<<"p["<<i<<"]="<<p[i]<<endl;
	}
	delete [] p;
  return 0;
}
