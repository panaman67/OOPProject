import java.util.Map.*;

public class Runner
{
	public static void main(String[] args)
	{
		Order<Integer, Integer> nicksOrder = new Order<Integer, Integer>();

		nicksOrder.put(0/*Egg Roll*/, 5);
		System.out.println(nicksOrder);
		
		System.out.println(nicksOrder.calculateBill());
	}
}
