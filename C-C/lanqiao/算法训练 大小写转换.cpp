//20160313
//问题描述
//　　编写一个程序，输入一个字符串（长度不超过20），然后把这个字符串内的每一个字符进行大小写变换，即将大写字母变成小写，小写字母变成大写，然后把这个新的字符串输出。
//　　输入格式：输入一个字符串，而且这个字符串当中只包含英文字母，不包含其他类型的字符，也没有空格。
//　　输出格式：输出经过转换后的字符串。
//输入输出样例
//样例输入
//AeDb
//样例输出
//aEdB

#include"iostream"
#include"cstring"
using namespace std;
int main()
{
	char s[20];
	cin>>s;
	for(int i=0;i<strlen(s);i++)
	{
		if(s[i]>='a'&&s[i]<='z')
			cout<<char(s[i]+'A'-'a');
		if(s[i]>='A'&&s[i]<='Z')
			cout<<char(s[i]-'A'+'a');
	}
	return 0 ;
}
