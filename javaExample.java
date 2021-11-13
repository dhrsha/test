import java.util.*;
public class javaExample
{
public static void main(String[] args)
{
ArrayList<String> obj = new ArrayList<String>();
obj.add("Ajeet");
obj.add("Harry");
obj.add("Chaitanya");
obj.add("Steeve");
obj.add("Anuj");
System.out.println("Original Array List:");
for(String str:obj)
System.out.println(str);
obj.add(5,"aaa Rahul");
obj.add(6,"bbbbbb Justin");
System.out.println("Original Array List:");
for(String str:obj)
System.out.println(str);
obj.add(5,"aaa Rahul");
obj.add(6,"bbbbbb Justin");
System.out.println("Array List after add operation:");
for(String str:obj)
System.out.println(str);
obj.remove("Harry");
obj.remove("Chaitanya");
System.out.println("Array List after remove operation:");
for(String str:obj)
System.out.println("Array List contains the string Ajeet:"+obj.contains("Ajeet"));
System.out.println("Array List contains the string pen:"+obj.contains("pen"));
System.out.println("Array List contains the string pencil:"+obj.contains("pencil"));
System.out.println("Array List contains the string book:"+obj.contains("book"));
}
}

