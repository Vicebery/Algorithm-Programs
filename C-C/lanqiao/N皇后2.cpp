#include "iostream"
#include "cmath"
using namespace std;

#define Max 20      //�������̵����ֵ
int a[Max];
int show(int S)    //�����������
{
	int i,p,q;
	int b[Max][Max]={0};     //���岢��ʼ��b[][]�������

	for(i=1;i<=S;i++)    //������i˳�����a[i]��������
	{
		b[i][a[i]]=1;
		printf("(%d,%d)\t",i,a[i]);
	}
	printf("\n");
	for(p=1;p<=S;p++)     //�����̵ĺ���p˳������ʺ��λ��
	{
		for(q=1;q<=S;q++)
		{
			if(b[p][q]==1)     //�ڵ�p�е�q�з���һ���ʺ�����
				printf("��");
			else
				printf("��");
		}
		printf("\n");
	}
	return 0;
}

int check(int k)    //����check����
{
	int i;
	for(i=1;i<k;i++)    //����k����ǰ��ĵ�1~~k-1�н����ж�
	{
		if((a[i]==a[k]) || (a[i]-a[k]==k-i) || (a[i]-a[k]==i-k))    //����Ƿ��ж���ʺ���ͬһ��ֱ����
		{
			return 0;
		}
	}
	return 1;
}

void check_m(int num)    //���庯��
{
	int k=1,count=0;
	printf("The possible configuration of N queens are:\n");
	a[k]=1;
	while(k>0)
	{
		if(k<=num && a[k]<=num)    //�ӵ�k�е�һ�е�λ�ÿ�ʼ��Ϊ��������ѡ�����λ��
		{
			if(check(k)==0)    //��k�е�a[k]�в��ܷ��ûʺ�
			{
				a[k]++;        //����̽�⵱ǰ�е���һ�У�a[k]+1
			}
			else
			{
				k++;         //��K�е�λ���Ѿ�ȷ���ˣ�����Ѱ�ҵ�k+1�лʺ��λ��
				a[k]=1;      //�ӵ�һ�п�ʼ����
			}
		}
		else
		{
			if(k>num)     //��������������Ҫ�������������
			{
				count++;
				printf("[%d]:  ",count);
				show(num);    //�����������show()
			}
			//���k>num��ִ���������д��룬��Ϊ��Ȼ�ҵ���N�ʺ������һ���⣬����Ҫ�ҵ������н⣬��Ҫ���ݣ��ӵ�ǰ���ûʺ����һ�м���̽��
			//���a[k]>numҲ��ִ���������д��룬����˵�ڵ�ǰ��û���ҵ����Է��ûʺ��λ�ã����ǻ��ݣ�����һ�лʺ�λ�õ���һ�м���̽��
			k--;      //����λ�ò�����Ҫ�����˻�ǰһ��
			a[k]++;   //������̽��һ��λ��
		}
	}
	printf("The count is: %d \n",count);
}

int main(void)
{
	int N,d;
	//system("color 2a");
	do
	{
		printf("********************N�ʺ�����ϵͳ*********************\n\n");
		printf("                  1. �Ļʺ�����                        \n");
		printf("                  2. �˻ʺ�����                        \n");
		printf("                  3. N �ʺ�����(N<20)                  \n");
		printf("                  4. �˳�                              \n");
		printf("******************************************************\n");
		printf("\n    ������1-4֮�����ѡ����Ҫ�Ĳ���\n\n"); /*��ʾ����ѡ��*/
		printf("      ��������Ҫѡ��Ĺ���ѡ��:__\n");
		scanf("%d",&d); 
		switch(d)
		{
		case 1:
			check_m(4);      //4�ʺ�����
			break; 
		case 2:
			check_m(8);     //8�ʺ�����
			break; 
		case 3:
			printf("������N��ֵ��_");
			fflush(stdin);      //�������
			scanf("%d",&N);
			printf("\n");
			if(N>0&&N<20)
			{
				check_m(N);    //N�ʺ�����
				break;
			}
			else
			{
				printf("���������������룺");
				printf("\n\n");
				break; 
			}
		case 4:
			exit(0);     //�������
		}
	}while(1);
	system("pause");
	return 0;
}

