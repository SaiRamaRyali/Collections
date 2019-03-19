
public class JuniourSavingsAccount extends SavingsAccount{
	
	
	
	String GardianName;
	
	
	public JuniourSavingsAccount(int accountNumber, float balanceInAccount, String statusOfAccount, int pinForAcconut,
			String branchWhereAccount, String gardianName) {
		super(accountNumber, balanceInAccount, statusOfAccount, pinForAcconut, branchWhereAccount);
		this.GardianName = gardianName;
	}

	public void getDetails()
	{
		System.out.println("Accountno"+AccountNumber);
		System.out.println("Balance"+getBalanceInAccount());	
	}
	
	//same method in super class the sub class is overriding the method to chnage the functionality of amount withdraw
	public void WithDraw(int EnteredPin, int ATMWithDrawingAmount)
	{	
		if(isPinValid(EnteredPin))
		{
			if(ATMWithDrawingAmount<100)
			{
				WithDraw(ATMWithDrawingAmount);
			}
			else
			{	
				System.err.println("Above the withdraw limit");	
			}
		}
		else
		{
			System.err.println("PIN Invalid");
		}
	}
	

	
	


}
