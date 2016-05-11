
//问题描述
//　　给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
//　　例如：
//　　A =
//　　1 2
//　　3 4
//　　A的2次幂
//　　7 10
//　　15 22
//输入格式
//　　第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
//　　接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
//输出格式
//　　输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
//样例输入
//2 2
//1 2
//3 4
//样例输出
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
