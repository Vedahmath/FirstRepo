class StaticDemo
{
static int count=10;
static void incr()
{
count++;
}
void disp()
{
System.out.println(count);
}
public static void main(String ar[])
{
StaticDemo s=new StaticDemo();
incr();
s.disp();
}
}