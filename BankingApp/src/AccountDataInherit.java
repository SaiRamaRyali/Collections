
public class AccountDataInherit {

	public static void main(String[] args) {
		
		JuniourSavingsAccount Account2 = new JuniourSavingsAccount(1000,1000.12f,"ACTIVE",134,"texas","Manu");
		
		Account2.WithDraw(10);
		Account2.Deposit(12);
		
	}

}
