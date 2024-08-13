import java.util.*;
class Array2D
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the array numbers");
int n=s.nextInt();
int a[][]=new int[n][n];
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
{
a[i][j]=s.nextInt();
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
