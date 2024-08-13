class Students
{
String name;
int regno;
double tmarks;
Students()
{
name="Unknown";
regno=0;
tmarks=20;
}
Students(String s,int r,double m)
{
name=s;
regno=r;
tmarks=m;
}
void studinfo()
{
System.out.println("name: "+name):
System.out.println("Regno :"+regno);
System.out.println("Total marks: "+tmarks);
}
double studinfo(int a,int b,int c)
{
tmarks=a+b+c;
return tmarks;
}
public static void main(String ar[])
{
Students s=new Students();
s.studinfo();
Students s1=new Students("ABC",111,45);
s1.studinfo();
System.out.println("Total marks of a student "+s1.name+"is : "+s1.studinfo(90,80,65));
}
}