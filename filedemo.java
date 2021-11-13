import java.util.Scanner;
import java.io.File;
class filedemo
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
String s=input.nextLine();
File f1=new File(s);
System.out.println("File name:"+f1.getName());
System.out.println("path:"+f1.getPath());
System.out.println("Abs path:"+f1.getAbsolutePath());
System.out.println("parent:"+f1.getParent());
System.out.println("This file is:"+(f1.exists()?"Exists":"Does not exists"));
System.out.println("Is file:"+f1.isFile());
System.out.println("Is Directory:"+f1.isDirectory());
System.out.println("Is readable:"+f1.canRead());
System.out.println("Is writable:"+f1.canWrite());
System.out.println("Is absolute:"+f1.isAbsolute());
System.out.println("File last modified:"+f1.lastModified());
System.out.println("file size:"+f1.length()+"bytes");
System.out.println("Is hidden:"+f1.isHidden());
}
}


