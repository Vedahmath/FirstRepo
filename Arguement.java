class Arguement
{
void addnum(int a,int b)
{
a=a+2;
b=b+2;
System.out.println("a= "+a);
System.out.println("b= "+b);
}
public static void main(String ar[])
{
Arguement s=new Arguement();
int x=20,y=30;
System.out.println("Before call, x= " +x+" y= "+y);
s.addnum(x,y);
System.out.println("After call, x= " +x+" y= "+y);
}
}