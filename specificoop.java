import java.lang.*;

class Arithematic
{
	public int No1,No2;
	
	public Arithematic(int No1,int No2)
	{
		this.No1=No2;
		this.No2=No2;
	}
	
	public int Addition()
	{
		int Ans=0;	
		Ans=No1+No2;
		return Ans;
	}
	

}

class specificoop
{
	public static void main(String Ars[])
	{
		Arithematic obj=new Arithematic(10,11);
		
		int Ret=0;
		
		Ret=obj.Addition();
		System.out.println("Addition is:"+Ret);
	
	}

}
