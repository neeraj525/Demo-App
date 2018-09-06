public class OccurSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a="HelloHelloHello";
    String b="Hello";
   int count=0;
   for(int i=0;i<=a.length()-b.length();i++)
   {
	   String sub=a.substring(i ,i + b.length());
     if(sub.compareTo(b)==0);
     {
    	 count++;
     }
	}
   System.out.println(count);
	}
}
