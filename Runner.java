import java.util.Map.*;
import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		Order<Integer, Integer> nicksOrder = new Order<Integer, Integer>();
		
		System.out.println("Object Oriental Place Chinese Restaurant");
		System.out.println("------------------Menu------------------");
		for (Food item : Food.menu)
		{
			System.out.print(item);
		}

		System.out.print("What would you like to order: ");
		int choice = stdin.nextInt();

		nicksOrder.put(Food.menu.get(choice).id, 5);

		System.out.println(nicksOrder);
		System.out.println("Your final bill is: " + nicksOrder.calculateBill());

	}
}
