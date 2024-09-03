import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
class Files
{
    public void fun() throws FileNotFoundException,IOException
    {
   	 FileInputStream f =null;
   	 FileOutputStream fout =null;
   	 try{
   			 f = new FileInputStream("file1.txt");
   	   			 fout = new FileOutputStream("file.txt");
   		 }
   	 catch(FileNotFoundException e){System.out.println("File not found");}
   				  	
   	 int i =0;   	
   	 do
   	 	{
   		 try{
   		 i = f.read();
   		 fout.write(i);
   	 }catch(IOException e){}
   		 System.out.print((char)i);
   		 }while(i!=-1);
}
public static void main(String args[])throws FileNotFoundException, IOException
    {
   	 Files f1  = new Files();
   	 try{
   	 f1.fun();
   	 }
   	 catch(Exception e)
	{ 
		System.out.println("File not found");  
 	 }
}
}

