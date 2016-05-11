#include<stdio.h>
int main()
{
    int T,tag=0,ST=0,SG=0;
    scanf("%d",&T);
    while(T!=0)
    {
        T--;
        tag++;
        ST+=9;
        SG+=3;
        if(tag%10==0)
        {
            if(ST>SG)
            {
                if(T>=30)
                {
                   SG+=90;
                   T=T-30;
                }
                else
                {
                    SG=SG+T*3;
                    T=0;
                }
            }
        }
    }
    if(SG>ST)
        printf("@_@ %d",SG);
    if(SG<ST)
        printf("^_^ %d",ST);
    if(SG==ST)
        printf("-_- %d",ST);
    return 0;
}
