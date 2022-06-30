import java.lang.*;

class Arithematic
{
	public int Addition(int No1,int No2)
	{
		int Ans=0;	
		Ans=No1+No2;
		return Ans;
	}
	

}

class specific
{
	public static void main(String Ars[])
	{
		Arithematic obj=new Arithematic();
		
		int Ret=0;
		
		Ret=obj.Addition(10,11);
		System.out.println("Addition is:"+Ret);
	
	}

}
