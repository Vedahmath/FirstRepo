class Car
{
int engine;
int gear;
int speed;
String brake;
void printcarinfo()
{
System.out.println("Engine CC is : "+engine);
System.out.println("Number of gears : "+gear);
System.out.println("Break type is : "+brake);
System.out.println("top speed is : "+speed);
}
}
class CarDemo
{
public static void main(String ar[])
{
Car c=new Car();
c.engine=1200;
c.brake="Drum";
c.gear=4;
c.speed=120;
c.printcarinfo();
Car c1=new Car();
c1.engine=1000;
c1.brake="Disc";
c1.gear=5;
c1.speed=100;
c1.printcarinfo();
c.printcarinfo();
}
}