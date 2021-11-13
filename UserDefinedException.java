import java.util.Scanner;
class NegativeAmtException extends Exception
{
String msg;
NegativeAmtException(String msg)
{
this.msg=msg;
}
public String tostring()
{
return msg;
}
}
public class UserDefinedException
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter Amount:");
int a = s.nextInt();
try
{
if(a<0)
{
throw new NegativeAmtException("invalid Amount");
}
System.out.println("Amount Deposited");
}
catch(NegativeAmtException e)
{
System.out.println(e);
}
}
}

