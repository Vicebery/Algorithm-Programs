#include"iostream"
#include"cstdio"
#include"stdlib.h"
typedef struct a
{
	int data;
	struct a *next;
}ALink;
int main()
{
    int N,i,e;
    scanf("%d",&N);
    ALink *L,*s,*r;    //����L������������ ��LΪͷ�ڵ� 
    L=(ALink*)malloc(sizeof(ALink));
    r=L;
    for(i=0;i<N;i++)
    {
    	s=(ALink*)malloc(sizeof(ALink));
    	scanf("%d",&e);
    	s->data=e;				
    	r->next=s;			//β�巨 
		r=s;
	}
	r->next=NULL;	
		
	ALink *p=L->next; 
    while(p!=NULL)
    {
//    	pnext=p->next;		//��¼��һ���ڵ� 
    	int count=1;			//ѡ��һ����������Ŀǰ���ִ���Ϊһ 
    	ALink *q=p,*k,*same;
    	while(q!=NULL)//����q->next!=NULL*****BUG****������q 
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
