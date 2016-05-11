//20160308   by Vicebery
//　　编程实现两个复数的运算。设有两个复数 和 ，则他们的运算公式为：
//
//　　要求：（1）定义一个结构体类型来描述复数。
//　　（2）复数之间的加法、减法、乘法和除法分别用不用的函数来实现。
//　　（3）必须使用结构体指针的方法把函数的计算结果返回。
//　　说明：用户输入：运算符号(+,-,*,/) a b c d.
//　　输出：a+bi，输出时不管a,b是小于0或等于0都按该格式输出，输出时a,b都保留两位。
//
//输入：
//　　- 2.5 3.6 1.5 4.9
//输出：
//　　1.00+-1.30i

#include"iostream"
#include"iomanip"
#include<malloc.h> 
using namespace std;

typedef struct ComplexNum
{
	double a;
	double b;
 } Cp;
static Cp *add(Cp num1,Cp num2)
{
	Cp *result=(Cp*)malloc(sizeof(Cp));
	result->a=num1.a+num2.a;
	result->b=num1.b+num2.b;
	if(result==NULL)
		return NULL;
	else
		return result;
}
static Cp *sub(Cp num1,Cp num2)
{
	Cp *result=(Cp*)malloc(sizeof(Cp));
	result->a=num1.a-num2.a;
	result->b=num1.b-num2.b;
	if(result==NULL)
		return NULL;
	else
		return result;
}
static Cp *mul(Cp num1,Cp num2)
{
	Cp *result=(Cp*)malloc(sizeof(Cp));
	result->a=num1.a*num2.a-num1.b*num2.b;
	result->b=num1.a*num2.b+num1.b*num2.a;
	if(result==NULL)
		return NULL;
	else
		return result;
}
static Cp *div(Cp num1,Cp num2)
{
	Cp *result=(Cp*)malloc(sizeof(Cp));
	result->a=(num1.a*num2.a+num1.b*num2.b)/(num2.a*num2.a+num2.b*num2.b);
	result->b=(num1.b*num2.a-num1.a*num2.b)/(num2.a*num2.a+num2.b*num2.b);
	if(result==NULL)
		return NULL;
	else
		return result;
}
int main()
{
	static Cp num1,num2;
	char op;
	cin>>op;
	cin>>num1.a>>num1.b>>num2.a>>num2.b;
	switch (op)
	{
		case '+': cout<<fixed<<setprecision(2)<<add(num1,num2)->a<<"+"<<add(num1,num2)->b<<"i";break;
		case '-': cout<<fixed<<setprecision(2)<<sub(num1,num2)->a<<"+"<<sub(num1,num2)->b<<"i";break;
		case '*': cout<<fixed<<setprecision(2)<<mul(num1,num2)->a<<"+"<<mul(num1,num2)->b<<"i";break;
		case '/': cout<<fixed<<setprecision(2)<<div(num1,num2)->a<<"+"<<div(num1,num2)->b<<"i";break;
		default : break;
	}
	return 0;
}
