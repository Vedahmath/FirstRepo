import java.util.*;
import java.io.*;
class Collission extends Exception
{
private String str;
Collission()
{
str="not specific";
}
Collission(String s)
{
str=s;
}
public String toString()
{
return str;
}
}
class vehicle
{
private String no_r;
private String direction;
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the vehicle no: ");
no_r=sc.nextLine();
System.out.println("Enter the direction (up/down) of the vehicle "+no_r+" : ");
direction=sc.nextLine();
}
void check_collission(vehicle v)throws Collission
{
if(this.direction.equals(v.direction))
throw new Collission("Collission occured");
else
throw new Collission("No Collission");
}
}
class CustomException
{
public static void main(String ar[])
{
vehicle v1=new vehicle();
vehicle v2=new vehicle();
System.out.println("Enter details of vehicle-1");
v1.read();
System.out.println("Enter details of vehicle-2");
v2.read();
try
{
v1.check_collission(v2);
}
catch(Exception e)
{
System.out.println("Road status : "+e);
}
}
}