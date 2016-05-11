#include"iostream"
using namespace std;

//使用递归求第n项的三角数
 int triangle(int n)    
{
    if (n == 1) //这是递归的基准情形，一个递归没有基准的话，就没法跳出递归。
        return n;
     else        
        return (n + triangle(n - 1)); //调用本方法         
}
//阶乘的迭代法实现
int func(int n)
{
	int result = 1;
	for(int k=1;k<=n;++k)
		result = result * k;//迭代
	return result;
} 

//迭代实现fibonacci
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
