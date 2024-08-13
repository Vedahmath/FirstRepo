 class NumAdd
{
int sum(int num)
{
if(num==1)
return 1;
else
return num+sum(num-1);
}
public static void main(String ar[])
{
NumAdd n=new NumAdd();
System.out.println(n.sum(6));
}
}
