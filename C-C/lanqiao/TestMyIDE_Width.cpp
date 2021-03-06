#include"iostream"
#include"climits"
using namespace std;
int main()
{
	int n_int=INT_MAX;        //initialize n_int to max int value
	short n_short=SHRT_MAX;
	long n_long=LONG_MAX;
	long long n_llong=LLONG_MAX;
	
	//sizeof operator yields size of type or of variable
	cout<<"int is "<<sizeof (int)<<" bytes."<<endl;
	cout<<"short is "<<sizeof n_short<<" bytes."<<endl;
	cout<<"long is "<<sizeof n_long<<" bytes."<<endl;
	cout<<"long long is "<<sizeof n_llong<<" bytes."<<endl<<endl;
	
	cout<<"double is "<<sizeof(double)<<" bytes."<<endl;
	cout<<"float is "<<sizeof (float)<<" bytes."<<endl<<endl;
		
	cout<<"Maximum values: "<<endl;
	cout<<"int: "<<n_int<<endl;
	cout<<"short: "<<n_short<<endl;
	cout<<"long: "<<n_long<<endl;
	cout<<"long long: "<<n_llong<<endl<<endl;
	 
    cout<<"Minimum int value = "<<INT_MIN<<endl;
    cout<<CHAR_BIT<<" Bits = 1 byte ."<<endl;
	return 0;
 } 
