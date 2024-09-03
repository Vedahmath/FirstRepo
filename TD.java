class ThreadA extends Thread{  		 
void show()
{
 System.out.println("HELLO");
}
public void run()
{
for( int i=1; i<=10; i++)
{
	try
	{ 
		show();
		sleep(1000);
	}
catch(Exception ex){} 
}
 }
 }

class ThreadB extends Thread
{			 
void show()
{
System.out.println("\t WELCOME");
}
public void run() 
{
for( int i=1; i<=10; i++)
{
	try
	{
		show();
		sleep(1200);
	}
catch(Exception ex){} 
} 
}
}

class ThreadC extends Thread
{			 
void show()
{
System.out.println("\t\t GOOD MORNING");
}
public void run()
{
for( int i=1; i<=10; i++) 
{
	try
	{
		show();
		sleep(1400);
	}
catch(Exception ex){}
}
}  
}

public class TD
{
public static void main(String args[])
{
ThreadA a=new ThreadA() ;
ThreadB b= new ThreadB() ;
ThreadC c= new ThreadC() ;

Thread t1=new Thread(a, " Thread one") ;
Thread t2= new Thread(b, " Thread two") ;
Thread t3= new Thread(c, " Thread three") ;

t1.start() ;
t2.start() ;
t3.start() ;

System.out.println( " Main thread completed") ;
}
}  
