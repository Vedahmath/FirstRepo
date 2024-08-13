class Box
{
double height;
double width;
double depth;
Box()
{
height=width=depth=1;
}
Box(double height,double width,double depth)
{
this.height=height;
this.width=width;
this.depth=depth;
}
Box(double len)
{
height=width=depth=len;
}
double volume()
{
return height*width*depth;
}
}
class Construct
{
public static void main(String ar[])
{
Box b=new Box();
System.out.println("Volume is : "+b.volume());
Box b1=new Box(10,20,30);
System.out.println("Volume is : "+b1.volume());
Box b2=new Box(10);
System.out.println("Volume is : "+b2.volume());
}
}