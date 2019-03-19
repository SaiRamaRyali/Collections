import java.time.LocalDate;

//it represents account holder object
public class AccountHolder {
	
	//have some properties
	private String name;
	private LocalDate dob;
	private Gender gender;
	private String Email;
	private String phone;
	
	
	public AccountHolder(String name, LocalDate dob, Gender gender, String email, String phone) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.Email = email;
		this.phone = phone;
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


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	//need a reference
	

}
