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
		while (stdin.hasNextLine())
		{
			if (stdin.hasNextInt())
			{
				choice = stdin.nextInt();
				if (choice > 7 || choice < 0)
				{
					System.out.println("Please enter a valid choice (0-7)");
					continue;
				}
				break;
			}
			else
			{
				System.out.println("Input required to be integer");
				stdin.nextLine();
			}
		}
		nicksOrder.put(Food.menu.get(choice).id, 10);

		System.out.println(nicksOrder);
		System.out.println(String.format("Your final bill is: %.2f", 
					nicksOrder.calculateBill()));

	
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
