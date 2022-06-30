import java.lang.*;

class Demo
{
	public int i;
	public int j;
	
	Demo()
	{
		this.i=0;
		this.j=0;
		System.out.println("inside Default constructor");
	
	}
	
	Demo(int x,int y)
	{
		this.i=x;
		this.j=y;
		System.out.println("inside parameterized constructor");
	
	}
	
	
	public void fun()
	{
		System.out.println("inside fun");
		
	}
	
	public void gun()
	{
		System.out.println("inside gun");
		
	}


}

class marvellous
{
	public static void main(String args[])
	
	{
		System.out.println("inside main");
		
		Demo obj1=new Demo();
		
		obj1.fun();		//fun(obj)
		obj1.gun();		//gun(obj)
		
		//System.out.println(obj1);
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		
		
		Demo obj2=new Demo(11,21);
		
		obj2.fun();		//fun(obj)
		obj2.gun();		//gun(obj)
		
		//System.out.println(obj1);
		System.out.println(obj2.i);
		System.out.println(obj2.j);
	
	}


}



	

























