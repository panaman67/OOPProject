
public abstract class Employee
{
	String type;
	float wage;
	int hoursPerDay;
	boolean hourlyOrSalary;
	
	//Public setters for all Employees
	public String getType(){return type;}
	public float getWage(){return wage;}
	public int getHours(){return hoursPerDay;}
	public boolean getHourly(){return hourlyOrSalary;}
	
	//Public getters for all Employees
	public void setType(String newType){type = newType;}
	public void setWage(float newWage){wage = newWage;}
	public void setHoursPerDay(int newHours){hoursPerDay = newHours;}
	public void setHourlyOrSalary(boolean newStatus){hourlyOrSalary = newStatus;}

}
