import java.time.LocalDate;

 public abstract class Employee {
	
	int id;
	String name;
	String designation;
	Gender gender;   //enum type we can predefined the values
	LocalDate dob; 
	String Email;
	
	public Employee()
	{
		
	}
	public Employee(int id, String name, String designation, Gender gender, LocalDate dob, String email) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.dob = dob;
		Email = email;
	}

	 abstract public  void CalculateSalary();
	

}
