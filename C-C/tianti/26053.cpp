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
    ALink *L;    //����L������������ ��LΪͷ�ڵ� 
	CreatLink(L,a,N);
	ALink *p=L->next; 
    while(p!=NULL)
    {
    	int count=1;			//ѡ��һ����������Ŀǰ���ִ���Ϊһ 
    	ALink *q=p,*k,*same;
    	while(q!=NULL)
    	{
    		same=q->next;
    		if(same==NULL)break; 
    		k=q->next->next;		//��¼��ǰָ�����һ�� 
    		if(p->data==same->data)		//����������ɨ�裬�ǳ��ִ��� ��������ͬ����ɾ�� 
    		{
    			count++;
    			q->next=same->next;
    			free(same); 
				q=k;			//���ɾ������ͬ�ڵ㣬���������¸��ڵ� 
			}
			else q=same;		//û��������ͬ����ɨ���¸��ڵ� 
		}
		if(count%2==1)		//�ҵ����������ε�����ֱ����������� 
		{
			printf("%d",p->data);
			break;
		}
		p=p->next;			//ɨ����һ���ڵ�
	}
	free(L);
	return 0;
}
void CreatLink(ALink *&L, int a[], int n)
{
	L=(ALink*)malloc(sizeof(ALink));
    ALink *s,*r=L;    //����L������������ ��LΪͷ�ڵ� 
    int i,e;
    for(i=0;i<n;i++)
    {
    	s=(ALink*)malloc(sizeof(ALink));	
    	s->data=a[i];				
    	r->next=s;			//β�巨 
		r=s;
	}
	r->next=NULL;
}
