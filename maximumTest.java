
public class maximumTest
{
public static < T extends Comparable<T>> T maximum(T x,T y,T z)
{
T max=x;
if(y.compareTo(max)>0)
{
max=y;
}
if(z.compareTo(max)>0)
{
max=z;
}
return max;
}
public static void main(String[] args)
{
System.out.printf("Max1 is %d\n\n",maximum(3,4,5));
System.out.printf("Max2 is %1f\n\n",maximum(6.6,8.8,7.7));
System.out.printf("Max3 is %s\n\n",maximum("pear","apple","orange"));
}
}
