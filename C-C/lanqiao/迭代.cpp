#include"iostream"
using namespace std;

//ʹ�õݹ����n���������
 int triangle(int n)    
{
    if (n == 1) //���ǵݹ�Ļ�׼���Σ�һ���ݹ�û�л�׼�Ļ�����û�������ݹ顣
        return n;
     else        
        return (n + triangle(n - 1)); //���ñ�����         
}
//�׳˵ĵ�����ʵ��
int func(int n)
{
	int result = 1;
	for(int k=1;k<=n;++k)
		result = result * k;//����
	return result;
} 

//����ʵ��fibonacci
int Fibonacci(int n)
{
   if (n < 3)
      return 1;
  else
   {
   		int first = 1;
   		int second = 1;
   		int temp = 0;
	 	for (int i=2; i<n; i++)
    	{
         	temp = first + second;
          	first = second;
         	second = temp;
       	}
       return temp;
   }
}
int main()
{
	int n;
	cin>>n;
//	cout<<triangle(n);
	cout<<func(n);
	return 0;
}
