import java.lang.*;


class Demo
{
	
	public int i;
	public int j;
	public static int k;
	
	
	
	public Demo()
	{
		System.out.println("inside constructor");
		this.i=0;
		this.j=0;
		
	}
	
	public void fun()
	{
	
		System.out.println("inside non static fun");
		
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.k);
	}
	
	
	public static void gun()
	{
	
		System.out.println("inside static gun");
		
		System.out.println(k);
		
	}



}

//Demo.k=10;
//Demo.gun();

class staticDemo
{

	static 
	{
		//k=10;
		System.out.println("inside static block");

	}
	public static void main(String Args[])
	{
		System.out.println("inside main");
		
		Demo.gun();
		Demo obj;
		obj=new Demo();
		
		
	
		obj.fun();
		
		
		System.out.println(obj.i);
		System.out.println(obj.j);
	
	}
	

}
