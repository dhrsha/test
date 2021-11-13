import java.io.*;
import java.util.*;
class filedemo
{
  public static void main(string args[])
  {
  string filename;
  Scaner s=new Scanner(System.in);
  system.out.println("Enter the file name");
  file f1=new File(Filenamer);
  System.out.println("******************");
  System.out.println("FILE INFORMATION");
  Sysrem.out.println("****************");
  System.out.println("NAME OF THE FILE"+f1.getName());
  System.out.println("PATH OF THE FILE"+f1.getPath());
  System.out.println("PARENT"+f1.getParent());
  if(f1.exists())
       System.out.println("THE FILE EXISTS");
   else
       System.out.println("THE FILE DOES NOT EXISTS");
    if(f1.canRead())
       System.out.println("THE FILE CAN BE READ");
   else
       System.out.println("THE FILE CANNOT BE READ");
    if(f1.canWrite())
       System.out.println("WRITE OPERATION IS PERMITTED  
