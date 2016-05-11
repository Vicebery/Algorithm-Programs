//20160313    By Vicebery
//从键盘读入n个整数，使用动态数组存储所读入的整数，并计算它们的和与平均值分别输出。要求尽可能使用函数实现程序代码。平均值为小数的只保留其整数部分。
//
//样例输入: 
//5 
//3 4 0 0 2
//样例输出:
//9  1
//
//样例输入: 
//7
//3 2 7 5 2 9 1
//样例输出:
//29  4

#include"iostream"
using namespace std;
int main()
{
	int n,sum=0;
	cin>>n;
	int *arr = new int [n];
	for(int i=0;i<n;i++)
		cin>>arr[i];
	for(int i=0;i<n;i++)
	{
		sum+=arr[i];
	} 
	cout<<sum<<" "<<sum/n;
	delete [] arr;
	return 0;
}
