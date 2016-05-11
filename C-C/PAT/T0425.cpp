#include"iostream"
using naemspace std;
typedef struct node * nodeptr;
struct node
{
	int value;
	nodeptr next;
};
nodeptr BubbleSort(nodeptr h)
{
	nodeptr p,q;
	int flag_swap;
	if(!h->next) return h;
	do
	{
		flag_swap = 0 ;
		p=h;
		while(p->next->next)
		{
			if()
			{
				flag_swap++;
				q=p->next;
				//
				//
				//	
			}	
			else p=p->next;
		}		
	}while(flag_swap>0);
	return h;
}
int main()
{
		
	return 0;
} 

