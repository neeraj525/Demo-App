import java.util.Scanner;

public class reverse{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int rem,n;
int result=0; 
System.out.println("Enter the number");
int num=sc.nextInt();
n=num;
while(num!=0)
{
rem=num%10;
result=(result*10)+rem;
num=num/10;
}
System.out.println("reversed number : " +result);
}
}