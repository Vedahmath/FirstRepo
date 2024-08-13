class This
{
int regno;
String name;
double fee;
This(int regno,String name,double fee)
{
this.regno=regno;
this.name=name;
this.fee=fee;
}
void Thisinfo()
{
System.out.println("Name : "+name);
System.out.println("Reg no : "+regno);
System.out.println("Fees : "+fee);
}
public static void main(String ar[])
{
This t=new This(123,"ABC",60000);
This t1=new This(456,"XYZ",52000);
t.Thisinfo();
t1.Thisinfo();
}
}