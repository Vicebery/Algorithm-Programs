//20160210      by  Vicebery
//��������
//�����������[a,b]�������������������ֽ⡣
//�����ʽ
//����������������a��b��
//�����ʽ
//����ÿ�����һ�����ķֽ⣬����k=a1*a2*a3...(a1<=a2<=a3...��kҲ�Ǵ�С�����)(����ɿ�����)
//��������
//3 10
//�������
//3=3
//4=2*2
//5=5
//6=2*3
//7=7
//8=2*2*2
//9=3*3
//10=2*5
//��ʾ
//������ɸ������������Ȼ���ٷֽ⡣
//���ݹ�ģ��Լ��
//����2<=a<=b<=10000

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
//void Fenjie(int &number)	//���г�ʱ�Ľⷨ 
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
