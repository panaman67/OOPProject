import java.util.Map.*;
import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		Order<Integer, Integer> nicksOrder = new Order<Integer, Integer>();	
		int choice = Integer.MAX_VALUE;
		Food.printMenu();

		System.out.print("What would you like to order: ");
		String input = stdin.next();
		while (!isInteger(input))
		{
			System.out.println("Please enter a valid id nerd!");
			System.out.print("What would you like to order: ");
			input = stdin.next();
		}
		choice = Integer.parseInt(input);
		nicksOrder.put(Food.menu.get(choice).id, 10);

		System.out.println(nicksOrder);
		System.out.println("Your final bill is: " + nicksOrder.calculateBill());

	}
	public static boolean isInteger(String str)
	{
		try
		{
			int d = Integer.parseInt(str);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}
}
