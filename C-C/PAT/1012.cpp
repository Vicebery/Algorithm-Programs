//@@Author: Vicebery
//@@Date : 20160407

#include"iostream"
#include"iomanip"
using namespace std;
int A1(const int a[], const int alen)    //A1 = 能被5整除的数字中所有偶数的和
{
	int sum=0;
	for(int i=0;i<alen;i++)
	{
		if(a[i]%5==0&&a[i]%2==0)
			sum+=a[i];
	}
	return sum;
}
bool A2(const int a[], const int alen)	//A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...
{
	int b[alen]={0},blen=0,sum=0;
	for(int i=0;i<alen;i++)
	{
		if(a[i]%5==1)
			b[blen++]=a[i];
	}
	if(b[0]==0||b[blen-1]==0)
		return false;
	else
		{
			for(int i=0;i<blen;i++)
			{
				if((i+1)%2==1)
					sum+=b[i];
				if((i+1)%2==0)
					sum-=b[i];
			}
			cout<<sum;
			return true;
		}
}
int A3(const int a[], const int alen)	//A3 = 被5除后余2的数字的个数
{
	int count=0;
	for(int i=0;i<alen;i++)
	{
		if(a[i]%5==2)
			count++;
	}
	return count;
}
bool A4(const int a[], const int alen)	//A4 = 被5除后余3的数字的平均数，精确到小数点后1位
{
	double sum=0,count=0,ave;
	for(int i=0;i<alen;i++)
	{
		if(a[i]%5==3)
		{
			count++;
			sum+=a[i];
		}
	}
	if(count==0)
		return false;
	ave=sum/count;
	cout<<fixed<<setprecision(1)<<ave<<" ";
	return true;
}
int A5(const int a[], const int alen)	//A5 = 被5除后余4的数字中最大数字
{
	int max=0;
	for(int i=0;i<alen;i++)
	{
		if(a[i]%5==4)
			if(max<a[i])
				max=a[i];
	}
	return max;
}
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
		cin>>a[i];
	if(A1(a,n)==0)
		cout<<"N ";
		else cout<<A1(a,n)<<" ";
	if(A2(a,n))
		cout<<" ";
		else cout<<"N ";
	if(A3(a,n)==0)
		cout<<"N ";
		else cout<<A3(a,n)<<" ";
	if(A4(a,n));
		else cout<<"N ";
	if(A5(a,n)==0)
		cout<<"N";
		else cout<<A5(a,n);	 
	return 0;
}
