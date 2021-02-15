
public abstract class Employee {
	private String firstName;
	private String lastName;
	private String SSN; //socialSecurityNumber
	
	private void setFirstName (String name){
		firstName = name;
	}
	
	private String getFirstName(){
		return firstName;
	}
	
	private void setLastName (String name){
		lastName = name;
	}
	
	private String getLastName(){
		return lastName;
	}
	
	private void setSSN (String number){
		SSN = number;
	}
	
	private String getSSN(){
		return SSN;
	}
	
	public abstract double earnings();
	
	public Employee (String first, String last, String number){
		setFirstName(first);
		setLastName(last);
		setSSN(number);
	}
}
