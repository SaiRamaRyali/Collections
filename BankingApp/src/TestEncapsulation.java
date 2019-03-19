
public class TestEncapsulation {

	
	public static void main(String[]args)
	{
		SavingsAccount account = new SavingsAccount(101,5000,"ACTIVE",1234,"Priceton");
		
		//account.BalanceInAccount = 10000;
		//System.out.println(account.getAccountNumber());
		System.out.println(account.getBalanceInAccount());
	}
}
