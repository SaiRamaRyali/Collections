
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import com.java.Item;

public class TestTreeSet {

	public static void main(String[] args) {
		
		
		//Comparator<Item> comparator = (Item i1,Item i2) -> {return i1.getName().compareTo(i2.getName());};
		
		//we will get ordered set of elements
		//no need to order agian..
		TreeSet<Item> items = new TreeSet<>((Item i1,Item i2) -> {return i1.getName().compareTo(i2.getName());});
		
		//elements are to be compareable
		//before the you inserting into tree set
//		names2.add("sushi");
//		names2.add("manu");
//		names2.add("sow");
//		names2.add("ram");
//		names2.add("kranthi");
//		
//		for(String str : names2)
//		{
//			System.out.println(str);
//		}
		
		
		//TreeSet<Item> items = new TreeSet<>();
		
		items.add(new Item(102,"Iphone",500));
		items.add(new Item(101,"blackberry",750));
		items.add(new Item(103,"samsug",520));
		items.add(new Item(108,"motog",800));

		//here they use id for sorting
		//by default
		//but if you want to do based on name or price
		for(Item str : items)
		{
			System.out.println("ID  :"+str.getID());
			System.out.println("Name:  "+str.getName());
			System.out.println("Price:  "+str.getPrice());
			System.out.println();
		}
	}

}
