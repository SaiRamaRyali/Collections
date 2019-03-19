

public  class SavingsAccount implements IAccountService {
	
	
	protected int AccountNumber;
	private float BalanceInAccount;
	String StatusOfAccount;
	private int PinForAcconut;
	String BranchWhereAccount;
	
	final static float InterestRate = 3.25f;
	
	AccountHolder accountHolder;//it is reference, accountholder is a variable
	//In this variable we can store object reference of AccountHolder type
	
	
	//Savings account obj holds a ref to account holder obj ref
	
	
	//default Constructor
	public SavingsAccount()
	{
		
	}

	//parameterized Constructor
	public SavingsAccount(int accountNumber, float balanceInAccount, String statusOfAccount, int pinForAcconut,
			String branchWhereAccount)
	{
		super();
		AccountNumber = accountNumber;
		BalanceInAccount = balanceInAccount;
		StatusOfAccount = statusOfAccount;
		PinForAcconut = pinForAcconut;
		BranchWhereAccount = branchWhereAccount;
	}
	
	//Instance Methods or Non-static methods call using object reference 
	
	public float getBalanceInAccount()
	{
		return BalanceInAccount;
	}
	
	
	public boolean isPinValid(int Enteredpin)
	{
		if(this.PinForAcconut==Enteredpin)
			return true;
		return false;
	}
	
	
	//Business Logic : code implements business rules
	public void WithDraw(int WithDrawingAmount)
	{
		if(this.StatusOfAccount.equals ("ACTIVE"))
		{
			if (WithDrawingAmount<=this.BalanceInAccount)
			{
				this.BalanceInAccount = this.BalanceInAccount - WithDrawingAmount;
			}
			else
			{
				System.err.println("You have insufficient funds");
			}
		}
		else
		{
			System.err.println("Account Inactive");
		}
	}
	
	
	public void WithDraw(int EnteredPin, int ATMWithDrawingAmount)
	{	
		if(isPinValid(EnteredPin))
		{
			if(ATMWithDrawingAmount<1000)
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
	
	
	
	public void Deposit(int DepositAmount)
	{
		if(this.StatusOfAccount.equals ("ACTIVE"))
			{
				if(DepositAmount>0)
					this.BalanceInAccount = this.BalanceInAccount + DepositAmount;
			}
		else
			{
				System.err.println("Account Inactive");
			}
		
	}
	

	
	
}
