
public class SalariedEmployee extends Employee{

	private double weeklySalary;
	
	@Override
	public double earnings() {
		return weeklySalary;
	}
	
	private void setWeeklySalaray(double salary){
		weeklySalary = salary;
	}
	
	public SalariedEmployee (String firstName, String lastName, String SSN, double salary){
		super(firstName, lastName, SSN);
		setWeeklySalaray(salary);
		
	}
	
}
