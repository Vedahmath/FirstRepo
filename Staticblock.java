class Staticblock
{
static int a=3;
static int b;
static void disp()
{
System.out.println("a = "+a);
System.out.println("b = "+b);
}
static
{
System.out.println("Now in the static block");
b=a+100;
}
public static void main(String ar[])
{
disp();
}
}