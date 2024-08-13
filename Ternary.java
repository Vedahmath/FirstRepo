class Ternary
{
public static void main(String arg[])
{
int a=200,b=30;
int large=a>b?a:b;
int small=a<b?a:b;
System.out.println("Largest number is: "+large);
System.out.println("Smallest number is: "+small);
int i=10,j=-10;
int k=i<0?i:-i;
int f=j<0?-j:j;
System.out.println(k);
System.out.println(f);
}
}