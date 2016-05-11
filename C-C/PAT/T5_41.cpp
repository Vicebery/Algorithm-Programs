#include<stdio.h>
#include"iostream"
#define MaxSize 224
int main()
{
	using namespace std;
    int N,M,i;
    int a[MaxSize][7],b[MaxSize];
    for(i=0;i<N;i++)
    {
    	cin>>a[i][0]>>a[i][1]>>a[i][2];
//        scanf("%d",&a[i][0]);
//        scanf("%d",&a[i][1]);
//        scanf("%d",&a[i][2]);
    }
     for(i=0;i<N;i++)
    {
    	cout<<a[i][0]<<a[i][1]<<a[i][2];
//       printf("%d",a[i][0]);
//       printf("%d",a[i][1]);
//       printf("%d",a[i][2]);
    }

    return 0;
}

