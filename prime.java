import java.util.Scanner;
public class prime{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("prime numbers");
for(int i=1;i<=n;i++){
int c=0;
for(int j=1;j<=n;j++){
if(i%j==0)
{
c++;
}
}
if(c==2)
{
System.out.println(i);
}
}
}
} 