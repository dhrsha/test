import java.util.*;
class win
{
public static void main(String[] args)
{
int unit;
int amount;
System.out.println("enter number of unit:");
Scanner Scan=new Scanner (System.in);
unit=Scan.nextInt();
if(unit<=100)
{
System.out.println("bill amount is"+(unit*0));
}
else if(unit<=200)
{
System.out.println("bill amount is"+((100*5)+(unit-100*7)));
}
else if(unit<=300)
{
System.out.println("bill amount is"+((100*5)+(100*7)+(unit-300)*15));
}
else
System.out.println("bill amount is"+((100*5)+(100*7)+(100*10)+(unit-300)*15));
}
}
