
public class Helpers
{
	static boolean isInteger(String str)
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

	static int extractUnsignedInt(String input)
	{
		try
		{
			int num = Integer.parseUnsignedInt(input);
			return num;
		}
		catch (NumberFormatException e) { }
		System.err.println("Invalid input");
		return -1;
	}

	static int extractUnsignedInt(String input, int maxValue)
	{
		try
		{
			int num = Integer.parseUnsignedInt(input);
			if (num < maxValue)
				return num;
		}
		catch (NumberFormatException e) { }
		System.err.println("Invalid input");
		return -1;
	}
}
