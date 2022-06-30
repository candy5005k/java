import java.lang.*;
import java.sql.*;

class DATABASE
{
	public static void main(String[] arr)
	{
		try
		{
			class.forName("com.mysql.jdbc.Driver");

			Connection con =DriverManager.getConnection("jdbc::mysql://localhost:3306/marvellous","root","root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student ");

			while(rs.next())
			{
				System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4));
			} 
			con.close();

		}
		catch(Exception obj)
		{
			System.out.println("Exception is :" +obj);
		}

	}
}