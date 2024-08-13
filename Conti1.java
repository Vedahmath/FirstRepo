class Conti1
{
public static void main(String arg[])
{
for(int i=0;i<=20;i++)
{
System.out.print(i+"\t");
if(i%2==0)
continue;
System.out.println();
if(i==9)
break;
}
}
}