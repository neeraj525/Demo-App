import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String orig,neww;
      Scanner sc=new Scanner(System.in);
      orig=sc.nextLine();
      neww=orig.replaceAll("[aeiouAEIOU]","");
      System.out.println("new string without vowel is "+neww);
	}

}
