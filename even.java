import java.util.Scanner;
public class even{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
System.out.println("even numbers");
for(int i=1;i<=n;i++)
{
if(i%2==0){
System.out.println(i);
}
}
}
}