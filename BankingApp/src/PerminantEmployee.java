import java.time.LocalDate;

public class PerminantEmployee extends Employee {
	
	LocalDate dateofAppointment;

	public PerminantEmployee(int id, String name, String designation, Gender gender, LocalDate dob, String email,
			LocalDate dateofAppointment) {
		super(id, name, designation, gender, dob, email);
		this.dateofAppointment = dateofAppointment;
	}
	
	public void CalculateSalary()
	{
		
	}

}
