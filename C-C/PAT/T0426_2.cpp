#include <stdio.h>
#include <stdlib.h>
#include"iostream"
#include <cstdio>
#include <malloc.h>
#define MAXSIZE 20 
#define NotFound 0
typedef int ElementType;
typedef int Position;
//typedef struct LNode *List;
typedef struct LNode
{
    ElementType Data[MAXSIZE];
    Position Last; /* 保存线性表中最后一个元素的位置 */
}List;
//List ReadInput(); /* 裁判实现，细节不表。元素从下标1开始存储 */
Position BinarySearch(List *Tbl, ElementType K );
void CreateList(List *&L,ElementType a[],Position n);
int ListEmpty(List *L);
void DispList(List *L);
int main()
{
    List *Tbl;
    ElementType K;
    Position P;
//    Tbl = ReadInput();
	//TestCode:
	int a[MAXSIZE],n;
	printf("请输入你要输入的数的个数：");
	scanf("%d", &n);
	printf("请依次输入%d个数：",n);
	for(int i=1;i<=n;i++)
		scanf("%d", &a[i]);
		
	CreateList(Tbl,a,n);
	DispList(Tbl);
	
	printf("请输入要查询的数：");
    scanf("%d", &K);
    P = BinarySearch( Tbl, K );
    printf("该数的位置为 %d\n", P);
    return 0;
}
//建立顺序表
void CreateList(List *&L,ElementType a[],Position n)
{
	int i;
	L=(List *)malloc(sizeof(List));
	for (i=1;i<=n;i++)
		L->Data[i]=a[i];
	L->Last=n;
}
/* 你的代码将被嵌在这里 */
Position BinarySearch( List *Tbl, ElementType K )
{
	Position head=1,end=Tbl->Last;
	if(Tbl->Data[head]==K)
		return head;
	if(Tbl->Data[end]==K)
		return end;
	Position mid=(head+Tbl->Last)/2;
	while(!(head==mid||end==mid))
	{
		if(Tbl->Data[mid]==K)	return mid;
		if(K<Tbl->Data[mid])
		{
			end=mid;
			mid=(head+end)/2;
		}
		else
		{
			head=mid;
			if(end-head==1)
				mid=end;
			else
				mid=(head+end)/2;
		}
	}
	return NotFound ;
} 
int ListEmpty(List *L)
{
	return(L->Last==0);
}
//输出线性表 
void DispList(List *L)
{
	int i;
	if (ListEmpty(L)) return;
	for (i=1;i<=L->Last;i++)
		printf("%d ",L->Data[i]);
	printf("\n");
}
