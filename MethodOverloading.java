class MethodOverloading
{
void area(double x)
{
System.out.println("Area of circle is : "+3.14*x*x);
}
void area(double x,double y)
{
System.out.println("Area of the rectangle: "+x*y);
}
void area(int x,int y)
{
System.out.println("Area of tne Triangle : "+0.5*x*y);
}
public static void main(String ar[])
{
MethodOverloading circle=new MethodOverloading();
MethodOverloading rectangle=new MethodOverloading();
MethodOverloading triangle=new MethodOverloading();
circle.area(2.2);
rectangle.area(2.4,7.0);
triangle.area(2,4);
}
}