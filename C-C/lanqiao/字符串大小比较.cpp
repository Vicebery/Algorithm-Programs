//20160209
//��������
//���������������ɴ�д��ĸ��Сд��ĸ��ɵ��ַ���(���Ƚ���1��10֮��)������֮��Ĺ�ϵ������4�����֮һ��
//����1�������ַ������Ȳ��ȡ����� Beijing �� Hebei
//����2�������ַ�������������ȣ�������Ӧλ���ϵ��ַ���ȫһ��(���ִ�Сд)������ Beijing �� Beijing
//����3�������ַ���������ȣ���Ӧλ���ϵ��ַ����ڲ����ִ�Сд��ǰ���²��ܴﵽ��ȫһ�£�Ҳ����˵���������������2�������� beijing �� BEIjing
//����4�������ַ���������ȣ����Ǽ�ʹ�ǲ����ִ�СдҲ����ʹ�������ַ���һ�¡����� Beijing �� Nanjing
//��������ж�����������ַ���֮��Ĺ�ϵ�����������е���һ�࣬������������ı�š�
//�����ʽ
//�����������У�ÿ�ж���һ���ַ���
//�����ʽ
//��������һ�����֣������������ַ����Ĺ�ϵ���
//��������
//BEIjing
//
//beiJing 
//
//�������
//3
#include"iostream"
#include"cstring"
using namespace std;
bool aequb(char m[],char n[])
{
	for(int i=0;i<strlen(m);i++)
		if(m[i]!=n[i])
		   {
			   	return false;
		   }
    return true;
}
bool aequB(char m[],char n[])
{
	for(int i=0;i<strlen(m);i++)
		if(m[i]!=n[i]&&(char)(m[i]-32)!=n[i]&&(char)(m[i]+32)!=n[i])
		     return false;
	return true;
}
int main()
{
	char a[11],b[11];
	cin>>a;
	cin>>b;
	if(strlen(a)!=strlen(b))
		cout<<1;
	else
	{
		if(aequb(a,b))
			cout<<2;
		else if(aequB(a,b))
		         cout<<3;
			 else cout<<4; 
	} 
	return 0;
}
