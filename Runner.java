import java.util.Map.*;
import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		Order<Integer, Integer> nicksOrder = new Order<Integer, Integer>();	
		int choice = Integer.MAX_VALUE;
		String input = new String();

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
			//TODO
			//FIXME
			//This is a hack. I have NO fucking clue why but
			//the other way I did it had weird error dups.
			//I will look into it later but for now, copying the 
			//above if format fixed my problem.
			else if (stdin.hasNext())
			{
				input = stdin.nextLine();
				if (input.length() > 0)
				{
					System.out.println("Input required to be integer");
					continue;
				}
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
