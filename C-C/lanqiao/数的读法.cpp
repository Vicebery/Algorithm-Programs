//
//��������
//����Tom�������ڸ��о�������һ�Ź��ڻ���Ŀγ̣���һ������������Ϊͷ�ۣ�һ��Ⱦɫ�����г�ǧ���������ԣ����Ǵ�0��ʼ��ţ��������򣬼�ǧ���������ڡ�
//��������˵���ڶ�ѧ�������1234567009��λ���ϵļ��ʱ���⿴�������Ǻ���׼ȷ��������ġ�
//�������ԣ������е���Ҫһ��ϵͳ��Ȼ��������12 3456 7009ʱ���������Ӧ�����
//����ʮ������ǧ�İ���ʮ������ǧ���
//�����ú���ƴ����ʾΪ
//����shi er yi san qian si bai wu shi liu wan qi qian ling jiu
//����������ֻ��Ҫ������Ϳ����ˡ�
//������������ǰ����������һ��ϵͳ������һ�����������ִ���������������Ķ�д�Ĺ淶תΪ����ƴ��
//�ִ������ڵ�����������һ���ո���񿪡�
//����ע������ϸ��չ淶������˵��10010��������yi wan ling yi shi�������ǡ�yi wan ling shi����
//��100000��������shi wan�������ǡ�yi shi wan������2000��������er qian�������ǡ�liang qian����
//�����ʽ
//������һ�����ִ�����ֵ��С������2,000,000,000��
//�����ʽ
//������һ����СдӢ����ĸ�����źͿո���ɵ��ַ�������ʾ������Ӣ�Ķ�����
//��������
//12 3456 7009
//�������
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
