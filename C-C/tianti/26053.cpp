#include"iostream"
#include"cstdio"
#include"stdlib.h"
typedef struct a
{
	int data;
	struct a *next;
}ALink;
void CreatLink(ALink *&L, int a[], int n);
int main()
{
    int N,i;
    scanf("%d",&N);
    int a[N];
    for(i=0;i<N;i++)
    	scanf("%d",&a[i]);
    ALink *L;    //链表L保存所有数据 ，L为头节点 
	CreatLink(L,a,N);
	ALink *p=L->next; 
    while(p!=NULL)
    {
    	int count=1;			//选定一个数，该数目前出现次数为一 
    	ALink *q=p,*k,*same;
    	while(q!=NULL)
    	{
    		same=q->next;
    		if(same==NULL)break; 
    		k=q->next->next;		//记录当前指针的下一个 
    		if(p->data==same->data)		//对其后面的数扫描，记出现次数 ，并将相同的数删除 
    		{
    			count++;
    			q->next=same->next;
    			free(same); 
				q=k;			//如果删除了相同节点，就跳到下下个节点 
			}
			else q=same;		//没有遇到相同数，扫描下个节点 
		}
		if(count%2==1)		//找到出现奇数次的数，直接输出，跳出 
		{
			printf("%d",p->data);
			break;
		}
		p=p->next;			//扫描下一个节点
	}
	free(L);
	return 0;
}
void CreatLink(ALink *&L, int a[], int n)
{
	L=(ALink*)malloc(sizeof(ALink));
    ALink *s,*r=L;    //链表L保存所有数据 ，L为头节点 
    int i,e;
    for(i=0;i<n;i++)
    {
    	s=(ALink*)malloc(sizeof(ALink));	
    	s->data=a[i];				
    	r->next=s;			//尾插法 
		r=s;
	}
	r->next=NULL;
}
