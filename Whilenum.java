import java.util.*;
class Whilenum
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
int n=s.nextInt();
int i=1;
while(i<=n)
{
int j=1;
while(j<=n)
{
System.out.print(i*j+"\t");
j++;
}
System.out.println();
i++;
}
}
}