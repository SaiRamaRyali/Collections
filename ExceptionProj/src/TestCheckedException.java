import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCheckedException {
	
	
	//this try block down is called try with resources
	public static void process() throws SQLException
	{
		try(Connection con=DriverManager.getConnection("");FileReader file = new FileReader(""))
		{
			//db ops
			//the closing statement will be take care by the try block
			//no need to give it
			
			//we can give mutiple statement like file also
			//closing take care by the try with resources.
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * public static void process() throws SQLException { null; try { con= ; //db
	 * ops //con.close();//not sure it will execte even there is throws
	 * //surrounding with try and catch and having a finally will work
	 * 
	 * 
	 * //****System.exit(1);//if you type this then the final block wont execute
	 * 
	 * 
	 * return;//legal but it means the control will do to the method //calling this
	 * function.
	 * 
	 * 
	 * } catch(Exception e) { e.printStackTrace(); } //if exception is present or
	 * not finally block exceute.. finally { con.close();//even though return is
	 * there it will execute }//even you have break statement.
	 * 
	 * }
	 */

	public static void main(String[] args) throws SQLException {
		
		
		process();//it also throws exception give thows command

	}

}
 