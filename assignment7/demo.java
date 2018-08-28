interface Animal{
public void speak();
public void eat();
}

class Dog implements Animal{
public void speak(){
System.out.println("I am a Dog");
}
public void eat(){
System.out.println("Dog is eating");
}
}

class Cat implements Animal{
public void speak(){
System.out.println("I am a Cat");
}
public void eat(){
System.out.println("Cat is eating");
}
}

class demo{
public static void main(String[] x){
Dog a=new Dog();
Cat b=new Cat();
a.speak();
a.eat();
b.speak();
b.eat();
}
}