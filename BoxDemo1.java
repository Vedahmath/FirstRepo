class Box
{
double height;
double depth;
double length;
Box()
{
height=10;
depth=10;
length=10;
}
double volume()
{
return height*length*depth;
}
}
class BoxDemo1
{
public static void main(String ar[])
{
Box b=new Box();
Box b1=new Box();
double vol;
vol=b.volume();
System.out.println("Volume of box: "+vol);
vol=b1.volume();
System.out.println("Volume of box1: "+vol);
}
}