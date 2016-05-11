#include"iostream"
#include"cmath"
using namespace std;
bool IsPrime(int n)
{
  for(int i=2;i<=sqrt(n);i++)
  {
    if(n%i==0)
       return false;
  }
  return true;
}
int main()
{
  int n,count=0;
  cin>>n;
  for(int i=3;i<=n;i=i+2)
  {
    if(i+2<=n)
    {
      if(IsPrime(i)&&IsPrime(i+2))
        count++;
    }
  }
  cout<<count;
  return 0;
} 
