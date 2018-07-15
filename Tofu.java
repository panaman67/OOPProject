public class Tofu extends Food
{  
	//constructor for default tofu object
	public Tofu()
	{
		id = 2;
		name = "Homemade Tofu";
		price = 2.00f;
	}

	public String getDescription()
	{
		return "Warm, fluffy tofu made fresh in house every day.";
	}
}
