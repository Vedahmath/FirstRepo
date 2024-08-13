import java.io.*;
interface Cust
{
public void info();
public void show();
double tax=20.2;
}
class Emp implements Cust
{
int taxn;
double taxr;
Emp(int a,double b)
{
taxn=a;
taxr=b;
}
public void info()
{
double rate;
rate=tax+taxr+taxn;
System.out.println("Tax rate= "+rate);
}
public void show()
{
System.out.println("Show method invoked");
}
}
class Office
{
public static void main(String ar[])throws IOException
{
DataInputStream d=new DataInputStream(System.in);
System.out.println("Enter the current tax rate: ");
int t=Integer.parseInt(d.readLine());
System.out.println("Enter the Next tax rate : ");
double tr=Double.parseDouble(d.readLine());
Emp obj=new Emp(t,tr);
obj.info();
obj.show();
}
} 