import java.util.Scanner;
import java.lang.*;
public class armstrong{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int rem,n;
double result=0.00; 
System.out.println("Enter the digit_size of the number");
n=sc.nextInt();
System.out.println("Enter the number");
int num=sc.nextInt();
while(num!=0)
{
rem=num%10;
result=result+(Math.pow(rem,n));
num=num/10;
}
if(result==num)
{
System.out.println("Armstrong number");
}
else{
System.out.println("not an Armstrong number");
}
}
}