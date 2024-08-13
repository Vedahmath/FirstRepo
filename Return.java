class Return
{
static int add(int a,int b)
{
int c=a+b;
return c;
}
static int sub(int a,int b)
{
int c=a-b;
return c;
}
public static void main(String ar[])
{
int sum=add(30,50);
System.out.println(sum);
int diff=sub(50,37);
System.out.println(diff);
}
}