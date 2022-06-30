import java.lang.*;
import java.util.*;
class Marvellous
{
	public int Arr[];
	
	public Marvellous(int size)
	{
	
		Arr=new int[size];
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter No:");
		for(int iCnt=0;iCnt<this.Arr.length;iCnt++)
		{
			this.Arr[iCnt]=sobj.nextInt();
		
		}
	
	
	}
	
	public void Display()
	{
	
		System.out.println("Elements in Arr:");
		for(int iCnt=0;iCnt<this.Arr.length;iCnt++)
		{
			System.out.println(this.Arr[iCnt]);
		
		}
	
	
	}
	
	public void DisplayEven()
	{
		for(int iCnt=0;iCnt<this.Arr.length;iCnt++)
		{
			if((Arr[iCnt]%2)==0)
			{
				System.out.println(this.Arr[iCnt]);
			}
		}
	
	}


}


class Demo extends Thread
{
	
	public Marvellous mref;	//composition
	
	public Demo(Marvellous obj)
	{
	
		this.mref=obj;
	
	
	}
	
	public void run()
	{
		this.mref.DisplayEven();
	
	}



}

class mythread6
{
	public static void main(String Args[]) throws Exception
	{
	
		//InputStreamReader iobj= new InputStreamReader(System.in);
		
		//BufferedReader
	
		Marvellous mobj1=new Marvellous(5);
		Marvellous mobj2=new Marvellous(8);	
		
		mobj1.Accept();
		mobj1.Display();
		
		mobj2.Accept();
		mobj2.Display();
		
		Demo dobj1=new Demo(mobj1);
		Demo dobj2=new Demo(mobj2);
		
		Thread t1=new Thread(dobj1);
		Thread t2=new Thread(dobj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("End of main Thread");		
						
	}

}
