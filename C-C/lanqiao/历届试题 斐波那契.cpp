//20160310 By Vicebery
//��������
//����쳲��������д�Ҷ��ǳ���Ϥ�����Ķ����ǣ�
//����f(x) = 1 .... (x=1,2)
//����f(x) = f(x-1) + f(x-2) .... (x>2)
//�������ڸ��������� n �� m������ϣ�������
//����f(1) + f(2) + ... + f(n) ��ֵ�������ֵ���ܷǳ����������ǰ����� f(m) ȡģ��
//������ʽ����
//
//
//���������������Ȼ�ܴ�������Ҫ�ٶ� p ��ģ��
//�����ʽ
//��������Ϊһ���ÿո�ֿ������� n m p (0 < n, m, p < 10^18)
//�����ʽ
//�������Ϊ1����������ʾ��
//��������
//2 3 5
//�������
//0
//��������
//15 11 29
//�������
//25
#include"iostream"
using namespace std;

long long Fibonacci(long long n)
{
	long long fir=1,sec=1,result=0;
	
	if(n==1||n==2)result=1;
	else{
			for(int i=2;i<n;i++)
			{
				result=fir+sec;
				fir=sec;
				sec=result;
			}
		}
	return result;
}
int main()
{
	long long n,m,p,sum=0;
	cin>>n>>m>>p;
	if(n%2==0)
	{
		for(int i=3;i<=n+1;i=i+2)
		{
			sum+=(Fibonacci(i)%Fibonacci(m));
		}
	}
	else{
			for(int i=3;i<=n;i=i+2)
			{
				sum+=(Fibonacci(i)%Fibonacci(m));
			}
			sum+=(Fibonacci(n)%Fibonacci(m));		
		}
	cout<<sum%Fibonacci(m)%p;
	return 0;
}
