import java.util.HashMap;

public class Order<K, V> extends HashMap<K, V>
{
	public String toString()
	{
		String ret = new String();

		int listNum = 0;
		for (Entry<K, V> entry : this.entrySet())
		{
			ret += String.format("%d %-20s %d%n", 
					++listNum, entry.getKey(), entry.getValue());
		}
		return ret;
	}

	public float calculateBill()
	{
		float amountDue = 0f;
		for (Entry<K, V> orderedFood : this.entrySet())
		{
			amountDue += Food.menu.get((int)orderedFood.getKey()).getPrice() 
				* (int)orderedFood.getValue();
		}
		return amountDue;
	}
}
