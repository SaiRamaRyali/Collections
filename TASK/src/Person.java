import java.time.LocalDate;

public class Person {
	
	private int ID;
	private String name;
	
	 private LocalDate dob;
	 
	 private Gender gender;

	 public Person()
	 {
		 
	 }
	public Person(int iD, String name, LocalDate dob, Gender gender) {
		super();
		this.ID = iD;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	 
	 
	

}
