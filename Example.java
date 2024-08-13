class Book
{
void page()
{
System.out.println("Each books are of 200 pages");
}
}
class Classmate extends Book
{
void type()
{
System.out.println("Classmate books are ruled books");
}
}
class Aruns extends Book
{
void type()
{
System.out.println("Aruns books sre ruled and also unruled");
}
public static void main(String ar[])
{
Book b=new Book();
b.page();
Aruns a=new Aruns();
a.type();
Classmate C=new Classmate();
C.type();
}
}
