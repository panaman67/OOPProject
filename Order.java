import java.util.Stack;

public class Order<T> extends Stack<T>
{
	public String toString()
	{
		String ret = new String();
		for(T obj : this)
		{
    		//System.out.println(obj);
			ret += obj;
		}
		return ret;
	}
}
