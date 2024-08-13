import java.io.*;
public class Readchar
{
public static void main(String[] args)throws IOException
{
char c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
c=(char)br.read();
System.out.println(c);
}
}