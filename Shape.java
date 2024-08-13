class Shape
{
int square(int i)
{
return i*i;
}
double circle(double r)
{
return 3.141*r*r;
}
double tri(double h,double l)
{
return 0.5*l*h;
}
public static void main(String ar[])
{
Shape n=new Shape();
double res;
System.out.println("Area of a square: "+n.square(10));
res=n.circle(3);
System.out.println("Area of a circle: "+res);
res=n.tri(6,14);
System.out.println("Area of a triangle: "+res);
}
}