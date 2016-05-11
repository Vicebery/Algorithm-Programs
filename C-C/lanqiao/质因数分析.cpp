//20160210      by  Vicebery
//问题描述
//　　求出区间[a,b]中所有整数的质因数分解。
//输入格式
//　　输入两个整数a，b。
//输出格式
//　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
//样例输入
//3 10
//样例输出
//3=3
//4=2*2
//5=5
//6=2*3
//7=7
//8=2*2*2
//9=3*3
//10=2*5
//提示
//　　先筛出所有素数，然后再分解。
//数据规模和约定
//　　2<=a<=b<=10000

#include"iostream"
using namespace std;
bool IsPrimeNum(int &a)
{
	for(int i=2;i*2<=a;i++)
		if(a%i==0)
			return false;
    return true;
 } 
void Fenjie(int &number)
{
	int i,j;
    for (i = 2; i <= number; i++)
    {
        if (number % i == 0&&IsPrimeNum(i))
        {
           j = number / i;
           if (j == 1)
           {
              cout<<i;
              return ;
           }
           else
           {
             cout<<i<<"*";
             Fenjie(j);
             break;
           }
        }
    }
}
int main()
{
	int a,b;
	cin>>a>>b;

	for(int i=a;i<=b;i++)
	{
		if(IsPrimeNum(i))
			cout<<i<<"="<<i<<endl;
		else 
		{
			cout<<i<<"=";
			Fenjie(i);
			cout<<endl;
		}
		
	} 
     return 0;
}
//void Fenjie(int &number)	//运行超时的解法 
//{
// 	int c[15]={0};
// 	int ii=x;
//	cout<<x<<"=";
//	for(int k=0,j=2;j<=ii;j++)
//	{
//		if(IsPrimeNum(j)&&ii%j==0)
//			{
//				c[k++]=j;
//				ii/=j;
//				j=1;
//			}
//	}
//	for(int k=0;k<15&&c[k]!=0;k++)
//	{
//		if(c[k+1]==0)
//			{
//				cout<<c[k]<<endl;
//				break;
//			}
//		else cout<<c[k]<<"*";
//	}
//}
