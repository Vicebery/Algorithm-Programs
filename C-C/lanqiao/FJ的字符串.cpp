#include"iostream"
using namespace std;

void printfstring(int n)
{
 	if(n==1)  
    {  
      cout<<"A";  
    }  
    else
	{
    	printfstring(n-1);
    	cout<<(char)('A'+n-1);
    	printfstring(n-1);
	}
 } 
int main()
{
	int n;
	cin>>n;
	printfstring(n);
	return 0;
}
