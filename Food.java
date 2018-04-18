import java.util.*;

public abstract class Food
{
	int id;
	String name;
	float price;
	
	// Subclasses CAN override, 
	// CALL return super.toString() + your extras here????????
	public String toString()
	{
		return String.format(" %-5d %-25s %7.2f%n", id, name, price);
	}

	public static List<Food> menu = new ArrayList<Food>() {{
		add(new EggRoll()); 	// 0
		add(new Dumpling());	// 1
	}};

	public int getID() { return id; }
	public String getName() { return name; }
	public float getPrice() { return price; }

	/*  Example abstract methods to implement in our foods?
	 *  will uncomment when we decide
	 public abstract String getDescription();
	 public abstract boolean isHealthy();
	 public abstract boolean isMainDish();
	 public abstract boolean isAppetizer();
	*/

	public static void printMenu()
	{
		System.out.println("Object Oriental Place Chinese Restaurant");
		System.out.println("------------------Menu------------------");

		for (Food item : Food.menu)
		{
			System.out.print(item);
		}
	}
}
