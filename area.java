import java.until.Scanner;
abstract class calcarea
{
abstract void findTriangle(double b,double h);
abstract void findRectangle(double l,double b);
abstract void findSquare(double s);
abstract void findCircle(double r);
}
class findArea extends calcArea
{
void findRectangle(double b,double h);
{
double area=l*b;
Systetm.out.println("Area of Triangle,"+area);
}
void findRectangle (double l,double b)
{
double area=l*b;
System.out.println("Area of Rectangle:"+ area);
}
void findCircle(double r)
{
double area=3.14*r*r;
System.out.println("area of circle"+area);
}
}
class area
{
public static void main (String[] args)
{
double l,b,h,r,s;
findArea area=new findArea();
Scanner get=new Scanner (System.in);
System.out.println("n enter base & vertical height of triangle");
b=get.nextDouble();
h=get.nextDouble();
area.findtTriangle(b,h);
System.out.println("\n enter length & breadth of rectangle");
l=get.nextDouble();
b=get.nextDouble();
area.findRectangle(l,b);
syste.out.println("\n enter side of square");
s=get.nextDouble();
area.findSquare(s);
System.out.println("\n enter Radius of circle");
r=get.nextDouble();
area.findCricle(r);
}
}
