import java.time.LocalDate;

public class TestAssociations {
	
	public static void main(String[]args)
	{
		
		
		AccountHolder holder = new AccountHolder("Haenry", LocalDate.of(1995, 6, 5), Gender.Male, "v@123b ", "2356891");
		
		
		SavingsAccount account = new SavingsAccount(101,5000,"ACTIVE",1234,"Priceton");
		
		
		account.accountHolder = holder;
		
		
		System.out.println("Name: "+account.accountHolder.getName());
		System.out.println("Gender: "+account.accountHolder.getGender());
	}

}
