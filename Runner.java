
public class Runner
{
	public static void main(String[] args)
	{

		float amountDue = 0f;
		Order<String, Integer> nicksOrder = new Order<String, Integer>();
		//System.out.println(Food.menu);

		nicksOrder.put("Egg Roll", 5);
		System.out.println(nicksOrder);

		for (Entry<String, Integer> orderedFood : nicksOrder.entrySet())
		{
			//Food.menu.get()
		}
	}
}
