import java.io.*;

class file3
{
public static void main(String[] x)
{
	File f=new File("C:/Users/home/Desktop/write.txt");

	try
	{
		FileInputStream fin= new FileInputStream(f);

		int i;

		i=fin.read();

		while(i!=-1)
		{
			System.out.println(i +":" +(char)i);

			i=fin.read();

		}

		fin.close();

	}

		catch(IOException e)
		{
																																																																																														
			System.out.println(e);

		}

		

			

}	

}																