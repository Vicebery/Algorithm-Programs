
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

class Matrix 
{
public:
	int m_N;
	int m_matrix[30][30];
	Matrix(int n);
    void Input() ;
    void Output();	
};
Matrix::Matrix(int n)
{
	for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            m_matrix[i][j] = 0;
        }
    }
}
void Matrix::Input()
{
		for(int i=0;i<m_N;i++)
    {
        for(int j=0;j<m_N;j++)
        {
            cin>>m_matrix[i][j];
        }
        cout<<endl;
    }
	
}
void Matrix::Output()
{
		for(int i=0;i<m_N;i++)
    {
        for(int j=0;j<m_N;j++)
        {
            cout<<m_matrix[i][j]<<" ";
        }
        cout<<endl;
    }
	
}
Matrix mul(Matrix n1,Matrix n2)
{
	Matrix ret(n1.m_N);
	for(int i=0;i<n1.m_N;i++)
    {
        for(int j=0;j<n1.m_N;j++)
        {
            for(int k =0; k<n1.m_N;k++)
            {
                ret.m_matrix[i][j] += n1.m_matrix[i][k]*n2.m_matrix[k][j]; 
            }
        }
    }
    return ret;
}
int main()
{
	int N,M;
	cin>>N>>M;
	Matrix A(N),AM(N);
	A.m_N=N;
	A.Input();
	AM=A;
	for(int i=1;i<M;i++)
	{
		AM=mul(AM,A);
	}
	AM.Output();
	return 0;
}




















