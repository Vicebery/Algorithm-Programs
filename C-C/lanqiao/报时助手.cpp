//
//��������
//����������ǰ��ʱ�䣬����Ӣ�ĵĶ���������������
//����ʱ����ʱh�ͷ�m��ʾ����Ӣ�ĵĶ����У���һ��ʱ��ķ����ǣ�
//�������mΪ0����ʱ��������Ȼ����ϡ�o'clock������3:00������three o'clock����
//�������m��Ϊ0����ʱ��������Ȼ�󽫷ֶ���������5:30������five thirty����
//����ʱ�ͷֵĶ���ʹ�õ���Ӣ�����ֵĶ���������0~20������
//����0:zero, 1: one, 2:two, 3:three, 4:four, 5:five, 6:six, 7:seven, 8:eight, 9:nine, 10:ten, 11:eleven, 12:twelve,
// 13:thirteen, 14:fourteen, 15:fifteen, 16:sixteen, 17:seventeen, 18:eighteen, 19:nineteen, 20:twenty��
//����30����thirty��40����forty��50����fifty��
//�������ڴ���20С��60�����֣����ȶ���ʮ������Ȼ���ټ��ϸ�λ������31���ȶ�30�ټ�1�Ķ�����������thirty one����
//����������Ĺ���21:54������twenty one fifty four����9:07������nine seven����0:15������zero fifteen����
//�����ʽ
//����������������Ǹ�����h��m����ʾʱ���ʱ�ͷ֡����������ǰû��ǰ��0��hС��24��mС��60��
//�����ʽ
//�������ʱ��ʱ�̵�Ӣ�ġ�
//��������
//0 15
//�������
//zero fifteen

#include"iostream"
using namespace std;

void keyvalue(int t)
{
	switch(t)
	{
		case 0: cout<<"zero ";break;
		case 1: cout<<"one "; break;
		case 2: cout<<"two "; break;
		case 3: cout<<"three ";break;
		case 4: cout<<"four "; break;
		case 5: cout<<"five ";break;
		case 6: cout<<"six "; break;
		case 7: cout<<"seven ";break;
		case 8: cout<<"eight ";break;
		case 9: cout<<"nine ";break;
		case 10: cout<<"ten ";break;
		case 11: cout<<"eleven ";break;
		case 12: cout<<"twelve ";break;
		case 13: cout<<"thirteen ";break;
		case 14: cout<<"fourteen ";break;
		case 15: cout<<"fifteen ";break;
		case 16: cout<<"sixteen ";break;
		case 17: cout<<"seventeen ";break;
		case 18: cout<<"eighteen ";break;
		case 19: cout<<"nineteen ";break;
		case 20: cout<<"twenty ";break;
		case 30: cout<<"thirty ";break;
		case 40: cout<<"forty ";break;
		case 50: cout<<"fifty ";break;
		default: cout<<"error! ";break;
	}
}
void change(int num)
{
	if(num<=20)
	{
		keyvalue(num);
	}
	else 
	{
		int ge,shi;
		ge=num%10;
		shi=num-ge;
		if(ge==0)
		{
			keyvalue(num);
		}
		else
		{
			keyvalue(shi);
			keyvalue(ge);
		}
	}
}
int main()
{
	int h,m;
	cin>>h>>m;
	change(h);
	if(m)
		change(m);
	else 
		cout<<"o'clock";
	return 0;
}
