//program using unary operator

public class UnaryEx{
public static void main (String args[]){

int num1=25;
System.out.println(num1);
//post increment
int num2=num1++;
System.out.println(num1+""+num2);
//system.out.println(num2);
num2=++num1;
//pre increment
System.out.println(num1+""+num2);
char ch1='a';
char ch2=ch1++;
System.out.println(ch1+" "+ch2);


}
}