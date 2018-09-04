class constructor{
int a;
constructor(){
System.out.println("default constructor");
}
constructor(int y){
this();
System.out.println("parameterized constructor");
}

public static void main(String[] x){
constructor obj=new constructor(10);
}
}