#include"iostream"
using namespace std;
typedef struct
{
	char name[11];
	char ID[11];
	int grade;
}Stu;
void GetIn(Stu stu[],int n)
{
	for(int i=0;i<n;i++)
	{
		cin>>stu[i].name;
		cin>>stu[i].ID;
		cin>>stu[i].grade;
	}
}
void DispStu(Stu exp)
{
	cout<<exp.name<<" "<<exp.ID<<endl;
}
Stu GetMax(Stu stu[], int n)
{
	Stu MAX=stu[0];
	for(int i=0;i<n;i++)
	{
		if(MAX.grade<stu[i].grade)
			MAX=stu[i];
	}
	return MAX;
}
Stu GetMin(Stu stu[], int n)
{
	Stu MIN=stu[0];
	for(int i=0;i<n;i++)
	{
		if(MIN.grade>stu[i].grade)
			MIN=stu[i];
	}
	return MIN;
}
int main()
{
	int n;
	cin>>n;
	Stu stu[n];
	GetIn(stu,n);
	DispStu(GetMax(stu,n));
	DispStu(GetMin(stu,n));
	return 0;
}
