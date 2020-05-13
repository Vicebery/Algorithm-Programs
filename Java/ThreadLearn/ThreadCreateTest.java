package ThreadLearn;

public class ThreadCreateTest implements Runnable{
    int i = 0;
    //重写run方法，run方法的方法体就是现场执行体
    public void run()
    {
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"  "+i);

        }
    }
    public static void main(String[] args)
    {
        for(int i = 0;i< 100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"  : "+i);
            ThreadCreateTest t = new ThreadCreateTest();
            if(i==20)
            {
                new Thread(t,"new Thread 1").start();
                new Thread(t,"new Thread 2").start();
            }
        }
    }
}