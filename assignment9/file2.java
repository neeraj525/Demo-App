import java.io.*;

	class file2
	{

	public static void main(String[] x)
	{
		File f=new File("C:/Users/home/Desktop/write.txt");

	try
	{
		FileOutputStream fout=new FileOutputStream(f);
 
		String s="Hello Java";

		char ch[]=s.toCharArray();

		for(int i=0;i<s.length();i++)

	{

		fout.write(ch[i]);

	}

		fout.close();

	}

		catch(IOException e)
	{

		System.out.println(e);

	}
}

}