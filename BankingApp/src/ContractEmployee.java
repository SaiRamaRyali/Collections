import java.time.LocalDate;

public class ContractEmployee extends Employee {
	
	int contractPeriod;

	public ContractEmployee(int id, String name, String designation, Gender gender, LocalDate dob, String email,
			int contractPeriod) {
		super(id, name, designation, gender, dob, email);
		this.contractPeriod = contractPeriod;
	}
	
	
	public void CalculateSalary()
	{

	}

}
