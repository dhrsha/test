import java.io.*;
class employee{
String empName,address,mailId;
int empId;
long mobileNo;
}
class Programmer extends employee{
double bp,da,hra,pf,netSalary,crossSalary;
void read() throws Exception{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter employee Name:");
empName=in.readLine();
System.out.println("Enter employee Id:");
empId=Integer.ParseInt(in.readLine());
System.out.println("Enter employee address:");
address=in.readLine();
System.out.println("Enter employee mailId:");
mailId=in.readLine();
System.out.println("Enter employee mobileNo:");
Long.ParseLong(in.readLine());
System.out.println("Enter employee Basicpay:");
bp=Double.ParseDouble(in.readLine());
}
void calculate(){
da=bp*0.97;
hra=bp*0.10;
pf=bp*0.001;
crossSalary=bp+da+hra;
netSalary=crossSalary-pf;
}
void show(){
System.out.println("Employee Name:"+empName);
System.out.println("Employee ID:"+empId);
System.out.println("Employee address:"+address);
System.out.println("Employee mailId:"+mailId);
System.out.println("Employee mobileNo:"+mobileNo);
System.out.println("Basic pay:"+bp);
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("CROSS SALARY:"+crossSalary);
System.out.println("NET SALARY:"+netSalary);
}
}
class AssociateProfessor extends employee{
double bp,da,hra,pf,netSalary,crossSalary;
void read() throws Excepton{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter employeeName:");
empNmae=in.readLine();
System.out.println("Enter employee mobileNo:");
mobileNo=Long.ParseLong(in.readLine());
System.out.println("Enter employee BasicPay:");
bp=Double.ParseDouble(in.readLine());
}
void calculate(){
da=bp*0.97;
hra=bp*0.10;
pf=bp*0.001;
crossSalary=bp+da+hra;
netSalary=crossSalary-pf;
}
void show(){
System.out.println("Employee Name:"+empName);
System.out.println("Employee ID:"+empId);
System.out.println("Employee address:"+address);
System.out.println("Employee mailId:"+mailId);
System.out.println("Employee mobileNo:"+mobileNo);
System.out.println("Basic pay:"+bp);
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("CROSS SALARY:"+crossSalary);
System.out.println("NET SALARY:"+netSalary);
}
}
class Professor extends employee{
double bp,da,hra,pf,netSalary,crossSalary;
void read() throws Excepton{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter employeeName:");
empNmae=in.readLine();
System.out.println("Enter employee mobileNo:");
mobileNo=Long.ParseLong(in.readLine());
System.out.println("Enter employee BasicPay:");
bp=Double.ParseDouble(in.readLine());
}
void calculate(){
da=bp*0.97;
hra=bp*0.10;
pf=bp*0.001;
crossSalary=bp+da+hra;
netSalary=crossSalary-pf;
}
void show(){
System.out.println("Employee Name:"+empName);
System.out.println("Employee ID:"+empId);
System.out.println("Employee address:"+address);
System.out.println("Employee mailId:"+mailId);
System.out.println("Employee mobileNo:"+mobileNo);
System.out.println("Basic pay:"+bp);
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("CROSS SALARY:"+crossSalary);
System.out.println("NET SALARY:"+netSalary);
}
}
public class All{
public static void main(String sr[]) throws Exception{
System.out.println("PROGRAMMER");
System.out.println("*****************");
Programmer pro=new programmer();
Pro.read();
Pro.calculate();
Pro.Show();
System.out.println("ASSISTANT PROFESSOR");
System.out.println("**********************");
AssistantProfessor ap=new AssistantProfessor();
ap.read();
ap.calculate();
ap.show();
System.out.println("ASSOCIATE PROFESSOR");
System.out.println("********************");
AssociateProfessor asp=new AssociateProfessor();
asp.read();
asp.calculate();
asp.show();
System.out.println("PROFESSOR");
System.out.println("**********");
Professor p=new Professor();
p.read();
p.calculate();
p.show();
}
}

