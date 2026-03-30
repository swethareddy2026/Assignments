import java.util.ArrayList;

public class GroceryTracker {

	public static void main(String[] args) {
		ArrayList<String> groceryList = new ArrayList<String>();
		groceryList.add("Apples");
		groceryList.add("Bread");
		groceryList.add("Milk");
		groceryList.add("Eggs");
		groceryList.add("Coffee");

		groceryList.remove("Bread");

		if (groceryList.contains("Tea"))
			System.out.println("Milk is on the list!\n");
		else
			System.out.println("Milk is not on the list!\n");
		
		System.out.println("The total number of items on the list: "+ groceryList.size() + "\n");
		
		System.out.println("The items on grocery list are: ");
		for(String list: groceryList)
		{
			System.out.println(list);
		}
		
	}

}
