
//��������
//��������һ��N�׾���A�����A��M���ݣ�M�ǷǸ�������
//�������磺
//����A =
//����1 2
//����3 4
//����A��2����
//����7 10
//����15 22
//�����ʽ
//������һ����һ��������N��M��1<=N<=30, 0<=M<=5������ʾ����A�Ľ�����Ҫ�������
//����������N�У�ÿ��N������ֵ������10�ķǸ���������������A��ֵ
//�����ʽ
//���������N�У�ÿ��N����������ʾA��M��������Ӧ�ľ������ڵ���֮����һ���ո����
//��������
//2 2
//1 2
//3 4
//�������
//7 10
//15 22
#include"iostream"
using namespace std;

int main()
{
	int N,M;
	cin>>N>>M;
	int A[30][30],a[30][30],result[30][30];
	for(int i=0;i<N;i++)
	{
			for(int j=0;j<N;j++)
		{
			cin>>A[i][j];
			a[i][j]=A[i][j];
			result[i][j]=0;
		} 
	}
	if(M==0)
	{
		for(int i=0;i<N;i++)
			{
		 		for(int j=0;j<N;j++)
				{
					if(i==j)
					     result[i][j]=1;
				    else
						result[i][j]=0;
				} 
			}	
	}
	else if(M==1)
			{
				for(int i=0;i<N;i++)
				{
					for(int j=0;j<N;j++)
					{
						result[i][j]=A[i][j];
					} 
				}
			}
		else
		{
			for(int m=1;m<M;m++)
			{
				for(int i=0;i<N;i++)
				{
					for(int j=0;j<N;j++)
					{
						result[i][j]=0;
					} 
				}
				for(int i=0;i<N;i++)
		    	{
		    	    for(int j=0;j<N;j++)
		    	    {
		    	        for(int k =0; k<N;k++)
		    	        {
		   	             result[i][j] += a[i][k]*A[k][j]; 
		    	        }
		    	    }
		   		}
		   		for(int i=0;i<N;i++)
				{
					for(int j=0;j<N;j++)
					{
						a[i][j]=result[i][j];
					} 
				}
    		}
		}
    for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
		{
			cout<<result[i][j]<<" ";
		} 
		cout<<endl;
	}
	
	return 0;
 } 
