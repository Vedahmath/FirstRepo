class Rec
{
int factorial(int num)
{
System.out.println(num);
if(num==1)
return 1;
else
return num*factorial(num-1);
}
public static void main(String ar[])
{
Rec r=new Rec();
System.out.println(r.factorial(5));
}
}