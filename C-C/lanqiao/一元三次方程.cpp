 

#pragma once

#define WIN32_LEAN_AND_MEAN  // �� Windows ͷ���ų�����ʹ�õ�����
#include <stdio.h>
#include <tchar.h>

#ifndef STDAFX_H_
#define STDAFX_H_

struct t
{double x1;
 double x2;
 bool k;
};

struct range
{double x1;
 double x2;
};

class co      //����һ���ⷽ�̵���
{
private:
    double a,b,c,d;//���̵�ϵ��
  
    double X1,X2,X3;//���̵�����ʵ����
 
public:
 
 co();     //dafault constructor
 ~co(){}
 t check_eq_2(); //��f(x)�ĵ�����f'(x)=0�Ľ�
 double fx(double x){return a*x*x*x+b*x*x+c*x+d;}
 void reset_co(double aa,double bb,double cc,double dd){a=aa;b=bb;c=cc;d=dd;}
    void judge_range(t m);  //���ݼ�ֵ�㣬������̵ĸ����ڵ�����
 double solut_eq(double m,double n);
    void show()const;
 double XX1(){return X1;}

};

#endif

 

 

Դ�ļ�solot_eq3.cpp  ��

#include "stdafx.h"
#include <iostream>
#include <math.h>

#define a1 3.0*a
#define b1 2.0*b

co::co()
{ a=b=c=d=0.0;

  X1=X2=X3=0;

}

 

t co::check_eq_2()
  {
        t tt;
    double disc=b1*b1-4*a1*c;   //#define a1 3.0*a     #define b1 2.0*b
   

if(disc>0)
      {
    tt.x1=(-b1-sqrt(disc))/(2*a1);
    tt.x2=(-b1+sqrt(disc))/(2*a1);
    double x=tt.x1-1;
    if((a1*x*x+b1*x+c)>0)  tt.k=1;
    else tt.k=0;
       }
    else if(disc==0)
      {
         tt.x1=tt.x2=-b1/(2*a1);
            double x=tt.x1-1;
     if((a1*x*x+b1*x+c)>0)  tt.k=1;
     else tt.k=0;
       }
    else {
            tt.x1=tt.x2=0;
      if(c>0)  tt.k=1;
      else tt.k=0;
         }
    return tt;
  }


void co::judge_range(t m)
{
 range d;
 if(m.x1==m.x2&&m.k==1)      //ֻ��һ����
 {
  d.x1=0;
  d.x2=10.0;
  while(fx(d.x1)*fx(d.x2)>0)
  {
   if(fx(0)>0) {d.x2=d.x1;d.x1-=10.0;}   //����
   else {d.x1=d.x2;d.x2+=10.0;}          //����
  }
  X1=X2=X3=solut_eq(d.x1,d.x2);    //����Χ������������������ڴ˷�Χ�ĸ������
 
 }
 else if(m.x1==m.x2&&m.k==0)   //ֻ��һ����
 {
     d.x1=0;
  d.x2=10.0;
  while(fx(d.x1)*fx(d.x2)>0)
  {
   if(fx(0)<0) {d.x2=d.x1;d.x1-=10;}   //����
   else {d.x1=d.x2;d.x2+=10.0;}          //����
  }
     X1=X2=X3=solut_eq(d.x1,d.x2);//����Χ������������������ڴ˷�Χ�ĸ������
 }
 else if(m.x1!=m.x2&&m.k==1) //����������ȣ��п�����һ�����п���������
         if(fx(m.x1)>0&&fx(m.x2)>0)     //ֻ��һ����
   {
   d.x2=m.x1;
   d.x1=m.x1-10.0;
   while(fx(d.x1)*fx(d.x2)>0)
               {d.x2=d.x1;d.x1-=10;}   //����
   X1=X2=X3=solut_eq(d.x1,d.x2);//����Χ������������������ڴ˷�Χ�ĸ������
   }
   else if(fx(m.x1)<0&&fx(m.x2)<0)  //ֻ��һ����
   {
    d.x1=m.x2;
    d.x2=m.x2+10.0;
    while(fx(d.x1)*fx(d.x2)>0)
               {d.x1=d.x2;d.x2+=10.0;}          //����
    X1=X2=X3=solut_eq(d.x1,d.x2);//����Χ������������������ڴ˷�Χ�ĸ������
   }
   else                            //��������
   {
   range d2,d3;
            d2.x2=m.x1;
      d2.x1=m.x1-10.0;
   while(fx(d2.x1)*fx(d2.x2)>0)
               {d2.x2=d2.x1;d2.x1-=10;}   //����
            d3.x1=m.x2;
      d3.x2=m.x2+10.0;
   while(fx(d3.x1)*fx(d3.x2)>0)
               {d3.x1=d3.x2;d3.x2+=10.0;}          //����
   d.x1=m.x1;
   d.x2=m.x2;
   X1=solut_eq(d2.x1,d2.x2);
   X2=solut_eq(d.x1,d.x2);
   X3=solut_eq(d3.x1,d3.x2);   //��������
   }
     else if(m.x1!=m.x2&&m.k==0) //����������ȣ��п�����һ�����п��������� 
  {
    if(fx(m.x1)<0&&fx(m.x2)<0)     //ֻ��һ����
   {
   d.x2=m.x1;
   d.x1=m.x1-10.0;
   while(fx(d.x1)*fx(d.x2)>0)
               {d.x2=d.x1;d.x1-=10;}   //����
   X1=X2=X3=solut_eq(d.x1,d.x2);//����Χ������������������ڴ˷�Χ�ĸ������
   }
   else if(fx(m.x1)>0&&fx(m.x2)>0)  //ֻ��һ����
   {
    d.x1=m.x2;
    d.x2=m.x2+10.0;
    while(fx(d.x1)*fx(d.x2)>0)
               {d.x1=d.x2;d.x2+=10.0;}          //����
    X1=X2=X3=solut_eq(d.x1,d.x2);//����Χ������������������ڴ˷�Χ�ĸ������
   }
   else                            //��������
   {
   range d2,d3;
            d2.x2=m.x1;
      d2.x1=m.x1-10.0;
   while(fx(d2.x1)*fx(d2.x2)>0)
               {d2.x2=d2.x1;d2.x1-=10;}   //����
            d3.x1=m.x2;
      d3.x2=m.x2+10.0;
   while(fx(d3.x1)*fx(d3.x2)>0)
               {d3.x1=d3.x2;d3.x2+=10.0;}          //����
   d.x1=m.x1;
   d.x2=m.x2;
   X1=solut_eq(d2.x1,d2.x2);
   X2=solut_eq(d.x1,d.x2);
   X3=solut_eq(d3.x1,d3.x2);   //��������
   }
 
  }

}

double co::solut_eq(double m,double n)
{
 double x;
 if(fx(m)==0) x=m;
 else if(fx(n)==0)  x=n;
      else
   {
         x=(m+n)/2;
   while (fabs(fx(x))>1e-10)
   {
    if(fx(x)*fx(m)<0)  {n=x;x=(m+n)/2;}
    else {m=x;x=(m+n)/2;}
   }
       }
 return x;
}

void co::show() const
{
 std::cout<<"X1="<<X1<<'\t'<<"X2="<<X2<<'\t'<<"X3="<<X3<<std::endl;
}

int _tmain(int argc, _TCHAR* argv[])
{

t m;

    co first;
 first.reset_co(1,2,3,4);//����һԪ���η��̵�ϵ��
 m=first.check_eq_2();
 first.judge_range(m);
 first.show();

  
 return 0;
}
