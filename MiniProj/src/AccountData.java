
public class AccountData {

	public static void main(String[] args) {
			
			SavingsAccount Account1 = new SavingsAccount(1002,500.12f,"ACTIVE",1234,"Illnois");
			System.out.println("Before withdrawn Balance Avialble is :"+Account1.getBalanceInAccount());
			Account1.WithDraw(100);
			System.out.println("AccountNumber is :"+Account1.AccountNumber);
			System.out.println("Balance Avialble is :"+Account1.getBalanceInAccount());
			
			System.out.println("------------------------------------------------------------");
			
			SavingsAccount Account2 = new SavingsAccount(1003,615.23f,"ACTIVE",2345,"Bza");
			System.out.println("Before Deposit Balance Avialble is :"+Account2.getBalanceInAccount());
			Account2.Deposit(20);
			System.out.println("AccountNumber is :"+Account2.AccountNumber);
			System.out.println("Balance Avialble is :"+Account2.getBalanceInAccount());
			
			System.out.println("------------------------------------------------------------");
			
			SavingsAccount Account3 = new SavingsAccount(1004,1615.23f,"ACTIVE",1111,"Bza");
			System.out.println("Before ATM withdrwan Balance Avialble is :"+Account3.getBalanceInAccount());
			Account3.WithDraw(1111,100);
			System.out.println("AccountNumber is :"+Account3.AccountNumber);
			System.out.println("After ATM Withdrawn Balance Avialble is :"+Account3.getBalanceInAccount());
			
			//System.out.println("IntrestRate is :"+SavingsAccount.getInterestRate());
			
			
			
			
			
			
			
	}

}
