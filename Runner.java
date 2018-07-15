import java.util.Map.*;
import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		String input = new String();
		int amountOrdered = 0, selected = -1;
		Order<Integer, Integer> nicksOrder = new Order<Integer, Integer>();
		
		System.out.println("Object Oriental Palace Chinese Restaurant");
		Food.printMenu();
inputloop:
		do
		{
			printOptions();
			selected = Helpers.extractUnsignedInt(stdin.nextLine(), 4);
			switch (selected)
			{
				case  0:
					Food.printMenu();
					break;
				case 1:
					System.out.print("What to order (ID#): ");
					selected = requestOrderID();
					System.out.print("How many: ");
					amountOrdered = requestAmount();
					nicksOrder.put(selected, amountOrdered);
					break;
				case 2:
					System.out.print("Enter item ID: ");
					selected = requestOrderID();
					System.out.println("Description: " 
							+ Food.menu.get(selected).getDescription());
					break;
				case 3:
					break inputloop;
			}
			System.out.print("Anything else (Y/N): ");
			input = stdin.nextLine();
		} while (!input.toUpperCase().equals("N"));

		if (!nicksOrder.isEmpty())
		{
			System.out.println(nicksOrder);
			System.out.println(String.format("Your final bill is: $%.2f",
								nicksOrder.calculateBill()));
		}
		System.out.println("\nThank you! Please come again!");
	}

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

	static void printOptions()
	{
		System.out.print("-----------------Options-----------------\n" +
		                 " 0: Print menu\n" +
		                 " 1: Order something\n" +
		                 " 2: Get item description\n" +
		                 " 3: Done\n" +
		                 "Select option(#): ");
	}
}
