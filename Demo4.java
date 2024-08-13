class Demo4
{
void printmethod()
{
System.out.println("Now in printmethod");
}
void printinfo()
{
this.printmethod();
}
public static void main(String ar[])
{
Demo4 d=new Demo4();
d.printinfo();
}
}