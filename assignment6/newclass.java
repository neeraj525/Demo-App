final class base{
int n=2;
void say(){
System.out.println("do it");
}
void cal(){
int p;
p=n*n*n;
System.out.println(p);
}
}
class newclass extends base{
public static void main(String[] x){
newclass obj=new newclass();
obj.say();
obj.cal();
}
}