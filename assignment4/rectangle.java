import java.util.Scanner;
public class rectangle{
int l;
int b;
void CalculateArea(){
float area;
area=l*b;
System.out.println("area of rectangle "+area);
}

public static void main(String[] x){
rectangle r=new rectangle();
Scanner sc=new Scanner(System.in);
System.out.println("enter the length");
r.l=sc.nextInt();
System.out.println("enter the breadth");
r.b=sc.nextInt();
r.CalculateArea();
}
}