//20160308   by Vicebery
//�������ʵ���������������㡣������������ �� �������ǵ����㹫ʽΪ��
//
//����Ҫ�󣺣�1������һ���ṹ������������������
//������2������֮��ļӷ����������˷��ͳ����ֱ��ò��õĺ�����ʵ�֡�
//������3������ʹ�ýṹ��ָ��ķ����Ѻ����ļ��������ء�
//����˵�����û����룺�������(+,-,*,/) a b c d.
//���������a+bi�����ʱ����a,b��С��0�����0�����ø�ʽ��������ʱa,b��������λ��
//
//���룺
//����- 2.5 3.6 1.5 4.9
//�����
//����1.00+-1.30i

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
