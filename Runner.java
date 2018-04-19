import java.util.Map.*;
import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		Order<Integer, Integer> nicksOrder = new Order<Integer, Integer>();	
		int amountOrdered = 0, selected = -1;
		Scanner stdin = new Scanner(System.in);
		String input = new String();

		Food.printMenu();
	
		do{
			System.out.print("What to order (ID#): ");
			selected = requestOrderID();
			
			System.out.print("How many: ");
			amountOrdered = requestAmount();

			nicksOrder.put(Food.menu.get(selected).id, amountOrdered);
			
			System.out.print("Anything else (Y/N): ");
			input = stdin.nextLine();
		} while (!input.toUpperCase().equals("N"));
		System.out.println(nicksOrder);
		System.out.println(String.format("Your final bill is: %.2f", 
					nicksOrder.calculateBill()));
	}

	// TODO Will rename to something better
	static int requestOrderID()
	{
		Scanner bab = new Scanner(System.in);
		int num = -1;
		do {
			num = Helpers.extractUnsignedInt(bab.nextLine(), Food.menu.size());
		} while (num < 0);

		return num;
	}

	static int requestAmount()
	{
		Scanner bab = new Scanner(System.in);
		int num = -1;
		do {
			num = Helpers.extractUnsignedInt(bab.nextLine());
		} while (num < 0);

		return num;
	}
}
