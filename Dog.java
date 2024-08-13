class Animal
{
public void display()
{
System.out.println("Animal class");
}
}
class Dog extends Animal
{
public void disply()
{
System.out.println("Dog class");
}
public static void main(String ar[])
{
Dog d=new Dog();
d.disply();
d.display();
}
}