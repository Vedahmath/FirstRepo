package pack1;
import java.io.*;
import java.util.*;
public class univ
{
String x[][];
int m,n,i,j;
public void getdata()throws IOException
{
DataInputStream d=new DataInputStream(System.in);
System.out.println("Enter the Number of university : ");
n=Integer.parseInt(d.readLine());
x=new String[n][];
for(i=0;i<x.length;i++)
{
System.out.println("Enter the number of college under university : ");;
m=Integer.parseInt(d.readLine());
x[i]=new String[m];
}
for(i=0;i<x.length;i++)
{
System.out.print("Enter the college under university "+(i+1)+" ");
for(j=0;j<x[i].length;j++)
x[i][j]=d.readLine();
}
}
public void display()
{
System.out.println(Arrays.deepToString(x));
}
}