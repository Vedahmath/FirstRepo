class Box
{
double height;
double width;
double depth;
Box(double h,double w,double d)
{
height=h;
width=w;
depth=d;
}
double volume()
{
return height*depth*width;
}
}
class BoxDemo2
{
public static void main(String ar[])
{
Box b=new Box(10,5,3);
Box b1=new Box(10,13,8);
double vol;
vol=b.volume();
System.out.println("Volyme of a box: "+vol);
System.out.println("Volyme of a box1: "+b1.volume());
}
}
