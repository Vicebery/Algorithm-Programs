//πÿ”⁄æÿ’Û 
#include"iostream"
using namespace std;

class Matrix 
{
private:
	int m_rows;
	int m_cols;
	int m_matrix[30][30];
public:
//	Matrix& operator*=(Matrix &mat);
	Matrix(int rows,int cols);
    void Input(int rows,int cols) ;
    void Output(int rows,int cols) ;
    
    ~Matrix();		
};
Matrix::Matrix(int rows, int cols)
{
	m_rows=rows;
	m_cols=cols;
	for(int i=0;i<rows;i++)
    {
//        m_matrix[i] = new int[cols];
        for(int j=0;j<cols;j++)
        {
            m_matrix[i][j] = 0;
        }
    }
}
void Matrix::Input(int rows,int cols)
{
	cin>>rows>>cols;
		for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            cin>>m_matrix[i][j];
        }
        cout<<endl;
    }
	
}
void Matrix::Output(int rows,int cols)
{
		for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            cout<<m_matrix[i][j]<<" ";
        }
        cout<<endl;
    }
	
}
int main()
{
	Matrix A;
	int N;
	return 0;
}
