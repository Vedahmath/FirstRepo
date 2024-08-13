class Labelled
{
public static void main(String ar[])
{
outer:for(int i=1;i<=10;i++)
{
System.out.print(i+" ");
for(int j=1;j<=10;j++)
{
if(i==4 && j==4)
break;
System.out.print(j);
}
System.out.println();
}
}
}