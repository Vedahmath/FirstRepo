class Incre
{
public static void main(String args[])
{
int a=20;
System.out.println("Value of a is:" +a);
a++;
System.out.println("Value of a is:" +a);
System.out.println("Value of a is:" +(++a));
System.out.println("Value of y is:" +(a++));
int x=11;
int b=++x;
int c=b++;
int e=c++;
int d=e++;
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
}
}