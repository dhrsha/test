class pattern
{
public void DisplayA()
{
for(int i=1;i<=25;i++)
System.out.print("A");
}
public void DisplayB()
{
for(int i=1;i<=25;i++)
System.out.print("B");
}
public void DisplayC()
{
for(int i=1;i<=25;i++)
System.out.print("C");
}
}
class ThreadA extends Thread
{
pattern p;
ThreadA(pattern p)
{
this.p=p;
}
public void run()
{
p.DisplayA();
}
}
class ThreadB extends Thread
{
pattern p;
ThreadB(pattern p)
{
this.p=p;
}
public void run()
{
p.DisplayB();
}
}
class ThreadC extends Thread
{
pattern p;
ThreadC(pattern p)
{
this.p=p;
}
public void run()
{
p.DisplayC();
}
}
class Threaddemo
{
public static void main(String[] args)
{
pattern p=new pattern();
ThreadA t1=new ThreadA(p);
ThreadB t2=new ThreadB(p);
ThreadC t3=new ThreadC(p);
t1.start();
t2.start();
t3.start();
}
}




