class CallRef
{
int a;
int b;
CallRef(int x,int y)
{
a=x;
b=y;
}
void addnum(CallRef c)
{
a=c.a*20;
b=c.b*20;
System.out.println("a= "+a);
System.out.println("b= "+b);
}
public static void main(String ar[])
{
CallRef s=new CallRef(3,4);
System.out.println("Before call, a= "+s.a+" b= "+s.b);
s.addnum(s);
System.out.println("After call, a= "+s.a+" b= "+s.b);
}
}