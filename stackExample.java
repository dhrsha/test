import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class stack
{
private int top;
private int item[];
stack(int size)
{
top=-1;
item=new int[size];
}
void pushItem(int data)
{
if(top==item.length-1)
{
System.out.println("stack is full");
}
else
{
item[++top]=data;
System.out.println("pushed item:"+item[top]);
}
}
int popItem()
{
if(top<0)
{
System.out.println("stack underflow");
return 0;
}
else
{
System.out.println("pop item:"+item[top]);
return item[top--];
}
}
}
class stackExample{
public static void main(String[] args)throws IOException{
stack stk=new stack(5);
boolean yes=true;
int choice;
BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
do{
System.out.println("1)PUSH\n 2)POP\n3)EXIT\n\nEnter choice:");
choice=Integer.parseInt(is.readLine());
switch(choice){
case 1:
System.out.println("enter push item:");
stk.pushItem(Integer.parseInt(is.readLine()));
break;
case 2:
stk.popItem();
break;
case 3:
yes=false;
break;
default:System.out.println("Invalid choice");
break;
}
}while(yes==true);
}
}

