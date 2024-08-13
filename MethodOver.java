class Test
{
void add(int a,int b)
{
System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));
}
int add(int a,int b,int c)
{
return a+b+c;
}
double add(double a,double b)
{
return a+b;
}
}
class MethodOver
{
public static void main(String ar[])
{
Test t=new Test();
t.add(2,4);
int res=t.add(2,7,5);
System.out.println("Sum is : "+res);
System.out.println("SUM is : "+t.add(35.5,6.7));
}
} 