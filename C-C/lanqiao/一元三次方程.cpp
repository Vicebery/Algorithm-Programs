 

#pragma once

#define WIN32_LEAN_AND_MEAN  // 从 Windows 头中排除极少使用的资料
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

class co      //声明一个解方程的类
{
private:
    double a,b,c,d;//方程的系数
  
    double X1,X2,X3;//方程的三个实数根
 
public:
 
 co();     //dafault constructor
 ~co(){}
 t check_eq_2(); //求f(x)的导函数f'(x)=0的解
 double fx(double x){return a*x*x*x+b*x*x+c*x+d;}
 void reset_co(double aa,double bb,double cc,double dd){a=aa;b=bb;c=cc;d=dd;}
    void judge_range(t m);  //根据极值点，求出方程的根所在的区间
 double solut_eq(double m,double n);
    void show()const;
 double XX1(){return X1;}

};

#endif

 

 

源文件solot_eq3.cpp  ：

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
 if(m.x1==m.x2&&m.k==1)      //只有一个根
 {
  d.x1=0;
  d.x2=10.0;
  while(fx(d.x1)*fx(d.x2)>0)
  {
   if(fx(0)>0) {d.x2=d.x1;d.x1-=10.0;}   //左移
   else {d.x1=d.x2;d.x2+=10.0;}          //右移
  }
  X1=X2=X3=solut_eq(d.x1,d.x2);    //将范围传给求根函数，返回在此范围的根的情况
 
 }
 else if(m.x1==m.x2&&m.k==0)   //只有一个根
 {
     d.x1=0;
  d.x2=10.0;
  while(fx(d.x1)*fx(d.x2)>0)
  {
   if(fx(0)<0) {d.x2=d.x1;d.x1-=10;}   //左移
   else {d.x1=d.x2;d.x2+=10.0;}          //右移
  }
     X1=X2=X3=solut_eq(d.x1,d.x2);//将范围传给求根函数，返回在此范围的根的情况
 }
 else if(m.x1!=m.x2&&m.k==1) //根的情况不等，有可能有一个，有可能有三个
         if(fx(m.x1)>0&&fx(m.x2)>0)     //只有一个根
   {
   d.x2=m.x1;
   d.x1=m.x1-10.0;
   while(fx(d.x1)*fx(d.x2)>0)
               {d.x2=d.x1;d.x1-=10;}   //左移
   X1=X2=X3=solut_eq(d.x1,d.x2);//将范围传给求根函数，返回在此范围的根的情况
   }
   else if(fx(m.x1)<0&&fx(m.x2)<0)  //只有一个根
   {
    d.x1=m.x2;
    d.x2=m.x2+10.0;
    while(fx(d.x1)*fx(d.x2)>0)
               {d.x1=d.x2;d.x2+=10.0;}          //右移
    X1=X2=X3=solut_eq(d.x1,d.x2);//将范围传给求根函数，返回在此范围的根的情况
   }
   else                            //有三个根
   {
   range d2,d3;
            d2.x2=m.x1;
      d2.x1=m.x1-10.0;
   while(fx(d2.x1)*fx(d2.x2)>0)
               {d2.x2=d2.x1;d2.x1-=10;}   //左移
            d3.x1=m.x2;
      d3.x2=m.x2+10.0;
   while(fx(d3.x1)*fx(d3.x2)>0)
               {d3.x1=d3.x2;d3.x2+=10.0;}          //右移
   d.x1=m.x1;
   d.x2=m.x2;
   X1=solut_eq(d2.x1,d2.x2);
   X2=solut_eq(d.x1,d.x2);
   X3=solut_eq(d3.x1,d3.x2);   //求三个根
   }
     else if(m.x1!=m.x2&&m.k==0) //根的情况不等，有可能有一个，有可能有三个 
  {
    if(fx(m.x1)<0&&fx(m.x2)<0)     //只有一个根
   {
   d.x2=m.x1;
   d.x1=m.x1-10.0;
   while(fx(d.x1)*fx(d.x2)>0)
               {d.x2=d.x1;d.x1-=10;}   //左移
   X1=X2=X3=solut_eq(d.x1,d.x2);//将范围传给求根函数，返回在此范围的根的情况
   }
   else if(fx(m.x1)>0&&fx(m.x2)>0)  //只有一个根
   {
    d.x1=m.x2;
    d.x2=m.x2+10.0;
    while(fx(d.x1)*fx(d.x2)>0)
               {d.x1=d.x2;d.x2+=10.0;}          //右移
    X1=X2=X3=solut_eq(d.x1,d.x2);//将范围传给求根函数，返回在此范围的根的情况
   }
   else                            //有三个根
   {
   range d2,d3;
            d2.x2=m.x1;
      d2.x1=m.x1-10.0;
   while(fx(d2.x1)*fx(d2.x2)>0)
               {d2.x2=d2.x1;d2.x1-=10;}   //左移
            d3.x1=m.x2;
      d3.x2=m.x2+10.0;
   while(fx(d3.x1)*fx(d3.x2)>0)
               {d3.x1=d3.x2;d3.x2+=10.0;}          //右移
   d.x1=m.x1;
   d.x2=m.x2;
   X1=solut_eq(d2.x1,d2.x2);
   X2=solut_eq(d.x1,d.x2);
   X3=solut_eq(d3.x1,d3.x2);   //求三个根
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
 first.reset_co(1,2,3,4);//输入一元三次方程的系数
 m=first.check_eq_2();
 first.judge_range(m);
 first.show();

  
 return 0;
}
