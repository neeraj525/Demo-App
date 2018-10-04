class myThread extends Thread
{
 public void run()
 {
     for(int i=1;i<=1000;i++)
	{
	System.out.println(i);
	}
 }
}
public class Demo2 {
  
    public static void main(String[] x){
        
        myThread mt=new myThread();
        
        mt.start();
    }
}