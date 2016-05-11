#include<stdio.h>  
#include<stdlib.h>  
#include<malloc.h>  
//struct Num  
typedef struct CpNum
{    
    double real;    
    double imag;    
}Num;    
double a1,b1,a2,b2;    
void Input()    
{    
    scanf("%lf%lf%lf%lf",&a1,&b1,&a2,&b2);         
}    
Num *add()    
{    
    Num *ans=(Num *)malloc(sizeof(Num));    
//    ans=(Num *)malloc(sizeof(Num));  
    ans->real=a1+a2;    
    ans->imag=b1+b2;    
    return ans;    
}    
Num *sub()    
{    
    Num *ans=(Num *)malloc(sizeof(Num));    
//    ans=(Num *)malloc(sizeof(Num));    
    ans->real=a1-a2;    
    ans->imag=b1-b2;    
    return ans;    
}    
Num *mul()    
{    
    Num *ans=(Num *)malloc(sizeof(Num));    
//    ans=(Num *)malloc(sizeof(Num));    
    ans->real=a1*a2-b1*b2;    
    ans->imag=a1*b2+a2*b1;    
    return ans;    
}    
Num *divs()    //此处不能用div，可能是与系统里的div定义重复 
{    
    Num *ans=(Num *)malloc(sizeof(Num));    
//    ans=(Num *)malloc(sizeof(Num));    
    if(a2==0||b1==0||b2==0) return NULL;    
    double den=a2*a2+b2*b2;    
    ans->real=(a1*a2+b1*b2)/den;    
    ans->imag=(b1*a2-a1*b2)/den;    
    return ans;    
}    
int main()    
{    
    char op;    
//    Num *ans;    
//    ans=(Num *)malloc(sizeof(Num));    
    scanf("%c",&op);    
    Input();    
    switch(op)    
    {    
        case '+':printf("%.2lf+%.2lfi",add()->real,add()->imag);break;    
        case '-':printf("%.2lf+%.2lfi",sub()->real,sub()->imag);break;    
        case '*':printf("%.2lf+%.2lfi",mul()->real,mul()->imag);break;    
        case '/':printf("%.2lf+%.2lfi",divs()->real,divs()->imag);break;    
        default :break;    
    }    
//    printf("%.2lf+",ans->real);     
//    printf("%.2lfi",ans->imag);    
    return 0;    
 }   
