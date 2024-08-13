import java.io.*;
public class Readline
{
public static void main(String[] args)throws IOException
{
String s;	
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
s=(String)br.readLine();
System.out.println(s);
}
}