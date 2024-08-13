class Test
{
void add(double a,double b)
{
System.out.println((a+b));
}
void add(String s,String s1)
{
System.out.println(s+" "+s1);
}
public static void main(String ar[])
{
Test t=new Test();
t.add(8,7);
t.add(17.9,2.5);
t.add("VED","AMMU");
}
} 