import java.util.*;
class Discount
{
public static void main(String arg[])
{
Scanner n=new Scanner(System.in);
int tamt;
float dis;
System.out.println("Enter total amount: ");
tamt=n.nextInt();
if(tamt>0 && tamt<=2000)
System.out.println("SORRY!! NO DISCOUNT");
else if(tamt>2000 && tamt<=5000)
{
dis=tamt*5/100;
System.out.println("Congrats!!!! You have got 5% discount");
System.out.println("DISCOUNT IS : "+dis);
}
else if(tamt>5000 && tamt<=7000)
{
dis=tamt*10/100;
System.out.println("Congrats!! you have got 10% discount");
System.out.println("DISCOUNT IS : "+dis);
}
else if(tamt>7000)
{
dis=tamt*20/100;
System.out.println("CONGRATS!!!!! YOU HV GOT 20% DISCOUNT ON UR PURCHASE & ALSO 50% DISCOUNT ON UR NEXT PURCHASE");
System.out.println("DISCOUNT IS : "+dis);
}
else
System.out.println("invalid total amount");
}
}