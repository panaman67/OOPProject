import java.util.*;

public abstract class Food
{
  int id;
  String name;
  float price;

  public static List<Food> menu = new ArrayList<Food>() {{
    								add(new EggRoll());
							  }};


  public int getID(){ return id; }
  public String getName(){ return name; }
  public float getPrice(){ return price; }
}
