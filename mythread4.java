import java.lang.*;

class Marvellous extends Thread
{
	public void run()
	{
		
		for(int iCnt=0;iCnt<=100;iCnt++)
		{
				System.out.println("Thread Shedued:"+Thread.currentThread().getName()+":"+iCnt);	

		}		

	}	

}

class mythread4
{
	public static void main(String a[])
	{
		Marvellous mobj1=new Marvellous();
		Thread t1=new Thread(mobj1,"First");
		
		Marvellous mobj2=new Marvellous();
		Thread t2=new Thread(mobj2,"Second");
		
		t1.start();
		t2.start();
		
	}

}
