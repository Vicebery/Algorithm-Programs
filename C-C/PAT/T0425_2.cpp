#include"iostream"
#include"stdlib.h"
using namespace std;
int count=0;
int Max,Min; 
typedef struct node
{
	int data;
	struct node * next;	
} Node;
void CreateNode(Node *&h, int a[], int n)		//尾插法创建含头节点的单链表 
{
	Node *s,*r;	
	h=(Node *)malloc(sizeof(Node)); 		
	h->next=NULL;
	r=h; 
	for(int i=0;i<n;i++)
	{
		s=(Node *)malloc(sizeof(Node));
		s->data=a[i];
		r->next=s;
		r=s;
	}
	r->next=NULL;       //空节点结束 
}
void print(Node *h)
{
	if(h->next!=NULL)
		cout<<h->next->data<<" ";
	else return ;  	
	print(h->next);
}
Node* BubbleSort(Node *&h)
{	//h为带空头节点的链表的头指针 
	Node *p, *q;
	int flag_swap;
	if(!h->next) return h;
	do
	{
		flag_swap = 0 ;
		p=h;
		while(p->next->next)
		{
			if(p->next->data>p->next->next->data)//添加判断语句 
			{
				flag_swap++;
				q=p->next;
				//此处添加三条语句 
				p->next=q->next;
				q->next=p->next->next;
				p->next->next=q; 
					
			}	
			else p=p->next;
		}		
	}while(flag_swap>0);
	return h;
}
int main()
{
	int a[15]={11,21,31,17,18,19,4,5,6,15,16,7,58,9,8};
	Node *L,*LL;
	CreateNode(L,a,15);
	cout<<"L的地址: "<<L<<endl;
	print(L);
	cout<<endl<<"L的地址: "<<L<<endl;
	LL=BubbleSort(L);
	print(LL);
	return 0;
}
