//    20120228 By Vicebery 
//��������
//���һ����Ȼ��N��K���Ʊ�ʾ����������ڵ���λ���������ڵ����֣���ô���Ǿ�˵�������K��������LλK��������K��������Ŀ������K = 4��L = 2��ʱ������K����Ϊ11��13��20��22��30��31��33 ��7�������������Ŀ�ܴ������������1000000007ȡģ���ֵ��
//
//�����ʽ
//�������������������K��L��
//
//�����ʽ
//���һ����������ʾ�𰸶�10 0000 0007ȡģ���ֵ��
//
//��������
//4 2
//
//�������
//7
//
//���ݹ�ģ��Լ��
//����30%�����ݣ�KL <= 106��
//����50%�����ݣ�K <= 16�� L <= 10��
//����100%�����ݣ�1 <= K,L <= 100��

#include"iostream"
#include"math.h"
using namespace std;
//bool IsK(int &n)
//{
//	int x=n,mod;
//	while(x/10)
//	{
//		mod=x%10;
//		x=x/10;
//		if((x%10)==mod-1||(x%10)==mod+1)
//			return false;	
//	}
//	return true;
//}
//bool IsKnum(int &i,int &k)
//{
//	int x=i,mod;
//	while(x)
//	{
//		mod=x%10;
//		if(mod>=k)
//			return false;
//		x=x/10;
//	}
//	return true;
//}
bool IsK(int a[],int alen)
{
	for(int m=0;m<alen;m++)
		{
			if(a[m]==a[m+1]-1||a[m]==a[m+1]+1)
				return false;
		}
		return true;
}
int main()
{
	int K,L,count=0;
	cin>>K>>L;
	int arr[L]={0};
	for(int m=1;m<K;m++)
	{
		arr[L-1]=m;
		for(int i=0;i<L-1;i++)
		{
			for(int j=0;j<K;j++)
			{
				arr[i]=j;
				if(IsK(arr,L))
					count++;
			}
		}
	}
	
//	for(int i=pow(10,L-1);i<pow(10,L);i++)
//	{
//		if(IsK(i)&&IsKnum(i,K))
////			cout<<i<<" ";
//			count++;
//	}
	cout<<count%1000000007;
	return 0;
}




