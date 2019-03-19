


public class Test {

	public static void main(String[] args) {
		
	try
		{
			SavingsAccount account = new SavingsAccount(101,5000,"ACTIVE",1234,"Priceton");

			account  = null;
		
			account.WithDraw(2000);
		
			System.out.println("Acconut"+account.AccountNumber);
		
		
			
		}
	
	catch(Exception e)
		{
			System.out.println("Exception catched");
		}
	System.out.println("End of main()");
	}

}
