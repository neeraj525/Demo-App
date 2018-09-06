import java.util.*;
public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int count=1;
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)==' ')
    	{
    		count++;
    	}
    }
    System.out.println(count);
	}

}