//this program demonstrate the concept of constructor, super keyword,ucasting,single level inheritance,Method Dispatching i.e overridding

import java.lang.*;

class Demo
{
	public int i,j;
	
	public Demo()
	{
		i=11;
		j=21;
		System.out.println("inside Default Constructor");
	
	}
	
	public Demo(int a,int b)
	{
		i=a;
		j=b;
		System.out.println("inside Base Parameterized Constructor\n");
	}
	
	public void fun()
	{
		System.out.println("inside Base fun");
		System.out.println(i);
		System.out.println(j);
	
	}
	
	


}

class Derived extends Demo
{

	
	public Derived()
	{
		super(100,200);			//use of super to initalize member of base class throght the derived class constructor
		
		System.out.println("inside Derived constructor");
	}
	
	public void fun()
	{
	
		System.out.println("inside Derived fun");
		System.out.println(super.i);	//use of super to access member of base class throght the derived class fun
		System.out.println(super.i);
		
		super.fun();		//use of super to access method of base class throght the derived class fun
	
	}


}


class constructor
{
	public static void main(String Args[])
	{
		System.out.println("inside main");
		
		//Demo dobj=new Derived();	//upcasting
		Derived dobj=new Derived();	//object creation "NO casting"
		dobj.fun();
		
		System.out.println("inside main");	
		System.out.println(dobj.i);
		System.out.println(dobj.j);
		
			
	}

}
