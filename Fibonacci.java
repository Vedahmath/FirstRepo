class Fibonacci
{
int fibo(int num)
{
if(num<=1)
return 1;
else
return fibo(num-1)+fibo(num-2);
}
public static void main(String ar[])
{
Fibonacci f=new Fibonacci();
for(int i=1;i<=10;i++)
System.out.println(f.fibo(i));
}
}