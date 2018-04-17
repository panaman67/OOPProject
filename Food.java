import java.util.*;

public abstract class Food
{
	int id;
	String name;
	float price;
	
	// Subclasses CAN override, 
	// dont know wat that looks like yet
	public String toString()
	{
		return String.format("%-5d %s%n", id, name);
	}

	public static List<Food> menu = new ArrayList<Food>() {{
		add(new EggRoll()); 	// 0
		add(new Dumpling());	// 1
	}};

	public int getID(){ return id; }
	public String getName(){ return name; }
	public float getPrice(){ return price; }

	/*  Example abstract methods to implement in our foods?
	 *  will uncomment when we decide
	 public abstract String getDescription();
	 public abstract boolean isHealthy();
	 public abstract boolean isMainDish();
	 public abstract boolean isAppetizer();
	*/
}
