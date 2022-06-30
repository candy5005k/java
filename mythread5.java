import java.lang.*;

class Demo extends Thread
{
	public void run()	//Running State
	{
		for(int iCnt=0;iCnt<10;iCnt++)
		{
			System.out.println("Value of iCnt:"+Thread.currentThread().getName()+iCnt);
				try
				{
					Thread.sleep(1000);		
				}
				catch(Exception obj)
				{}
		}	
		
	}


}


class mythread5
{
	public static void main(String arg[])// throws Exception
	{
		Demo dobj1=new Demo();
		Thread t1=new Thread(dobj1,"First");	//New State
		
		Demo dobj2=new Demo();
		Thread t2=new Thread(dobj2,"Second");
		
		t1.start();		//Runnable State
		try
		{
			t1.join();		//for one by one exicution
		}
		catch(Exception obj)
		{}
		t2.start();
		
		//Dead Thread	
	
	}

}
