import java.util.Scanner;
class greatest
{
public static void main(String args[])
{
int a,b,c,d;
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=a>b?a:b>c?b:c;
System.out.println("greatest among three number:- "+d);
}
}