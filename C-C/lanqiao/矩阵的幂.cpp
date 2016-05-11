
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




















