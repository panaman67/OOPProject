import java.util.HashMap;

public class Order<Key, Value> extends HashMap<Key, Value>
{
	public String toString()
	{
		String ret = new String();

		int listNum = 0;
		for (Entry<Key, Value> entry : this.entrySet())
		{
			ret += String.format("%d %-20s %d%n", 
					++listNum, entry.getKey(), entry.getValue());
		}
		return ret;
	}
}
