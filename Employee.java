
public abstract class Employee
{
	String type;
	float wage;
	int hoursPerDay;
	
	public void getType()
	{
		System.out.println("Employee type: " + type);
	}
	
	public void getWage()
	{
		System.out.println("Employee wage: " + wage);
	}
	
	public void getHours()
	{
		System.out.println("Employee hours per day: " + hoursPerDay);
	}
	
	public abstract void setDescription();
}
