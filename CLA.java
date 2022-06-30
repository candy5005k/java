//Accept No from user from Command Line
//javac CLA.java	-complie
//java CLA 10 11	-run

import java.lang.*;

class CLA
{
	public static  void main(String Arg[])throws Exception 
	{
			System.out.println("First Number:"+Arg[0]);
			
			System.out.println("First Number:"+Arg[1]);
			
			int ans=Integer.parseInt(Arg[0])+Integer.parseInt(Arg[1]);
			
			System.out.println("Addition is :"+ans);
		
	
	}

}
