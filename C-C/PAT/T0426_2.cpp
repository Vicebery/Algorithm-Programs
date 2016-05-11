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
    Position Last; /* �������Ա������һ��Ԫ�ص�λ�� */
}List;
//List ReadInput(); /* ����ʵ�֣�ϸ�ڲ���Ԫ�ش��±�1��ʼ�洢 */
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
	printf("��������Ҫ��������ĸ�����");
	scanf("%d", &n);
	printf("����������%d������",n);
	for(int i=1;i<=n;i++)
		scanf("%d", &a[i]);
		
	CreateList(Tbl,a,n);
	DispList(Tbl);
	
	printf("������Ҫ��ѯ������");
    scanf("%d", &K);
    P = BinarySearch( Tbl, K );
    printf("������λ��Ϊ %d\n", P);
    return 0;
}
//����˳���
void CreateList(List *&L,ElementType a[],Position n)
{
	int i;
	L=(List *)malloc(sizeof(List));
	for (i=1;i<=n;i++)
		L->Data[i]=a[i];
	L->Last=n;
}
/* ��Ĵ��뽫��Ƕ������ */
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
//������Ա� 
void DispList(List *L)
{
	int i;
	if (ListEmpty(L)) return;
	for (i=1;i<=L->Last;i++)
		printf("%d ",L->Data[i]);
	printf("\n");
}
