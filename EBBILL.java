import java.util.*;
class EBBILL
{
public static void main(String args[])
{
int unit;
int amount;
System.out.println("Enter no.of units");
Scanner scan=new Scanner(System.in);
unit=scan.nextInt();
if(unit<=100)
{
System.out.println("the bill amount" +(unit*0));
}
else if(unit<=300)
{
System.out.println("the bill amount is" +((100*5)+(unit-100)*7));
}
else if(unit<=300)
{
System.out.println("the bill amount is" +((100*5)+(100*7)+(unit-200)*10));
}
else
{
System.out.println("the bill amount is" +((100*5)+(100*7)+(100*10)+(unit-300)*15));
}
}
}
