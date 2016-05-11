//
//问题描述
//　　Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
//　　比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。
//　　所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
//　　十二亿三千四百五十六万七千零九
//　　用汉语拼音表示为
//　　shi er yi san qian si bai wu shi liu wan qi qian ling jiu
//　　这样他只需要照着念就可以了。
//　　你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音
//字串，相邻的两个音节用一个空格符格开。
//　　注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，
//“100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
//输入格式
//　　有一个数字串，数值大小不超过2,000,000,000。
//输出格式
//　　是一个由小写英文字母，逗号和空格组成的字符串，表示该数的英文读法。
//样例输入
//12 3456 7009
//样例输出
//shi er yi san qian si bai wu shi liu wan qi qian ling jiu

#include"iostream"
using namespace std;

void NumToWord(int n)
{
	switch(n)
	{
		case 0: cout<<"ling ";break;
		case 1: cout<<"yi ";break;
		case 2: cout<<"er ";break;
		case 3: cout<<"san ";break;
		case 4: cout<<"si ";break;
		case 5: cout<<"wu ";break;
		case 6: cout<<"liu ";break;
		case 7: cout<<"qi ";break;
		case 8: cout<<"ba ";break;
		case 9: cout<<"jiu ";break;
		default : cout<<"error ! ";
	}
}
void change(int n)
{
	int qian,bai,shi,ge;
	qian=n/1000;
	bai=(n-qian*1000)/100;
	shi=(n-qian*1000-bai*100)/10;
	ge=n%10;
	if(bai!=0&&shi!=0)
		{
			if(qian!=0)
			{
				NumToWord(qian); cout<<"qian ";
			}
			NumToWord(bai);  cout<<"bai ";
			NumToWord(shi);	 cout<<"shi ";
		    if(ge!=0)
		    {
		    	NumToWord(ge);	 
			}
		}
	else	if(bai==0&&shi!=0)
			{
				if(qian!=0)
				{
					NumToWord(qian); cout<<"qian ";
					NumToWord(0);  
				}
			    if(shi!=1)
				{
					NumToWord(shi);	
				}
				cout<<"shi ";
			    if(ge!=0)
			    {
			    	NumToWord(ge);	 
				}
			}
			else	if(bai!=0&&shi==0)
					{
						if(qian!=0)
						{
							NumToWord(qian); cout<<"qian ";
						}
						NumToWord(bai);  cout<<"bai ";
					    if(ge!=0)
					    {	NumToWord(0);  
					    	NumToWord(ge);	 
						}
					}
					else	if(bai==0&&shi==0)
							{
								if(qian!=0)
								{
									NumToWord(qian); cout<<"qian ";
									if(ge!=0)
								    {	
								    	NumToWord(0);
								    	NumToWord(ge);	 
									}	
									
								} 
								else 
								{
									if(ge!=0)
								    {	
								    	NumToWord(ge);	 
									}
								}
							}
}

int main()
{
	int num;
	cin>>num;
	int yi,wan,ge;
	if(num/100000000)
	{
	   yi=num/100000000;
	   wan=(num-yi*100000000)/10000;
	   ge=(num-yi*100000000)-wan*10000;
	}
	else if(num/10000)
		{
			yi=0;
			wan=num/10000;
			ge=num-wan*10000;
		}
		else {
				yi=0;
				wan=0;
				ge=num;
		   	}
	if(yi)
	{
		change(yi);
		cout<<"yi ";
	}
	if(wan)
	{
		change(wan);
		cout<<"wan ";
		if(ge/1000==0&&ge)
		{
			cout<<"ling ";
			change(ge);
		}
		else
		{
			change(ge);
		}
	}
	else change(ge);
	return 0;
}
