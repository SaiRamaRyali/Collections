import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

import com.java.Item;
import com.java.ItemNameComparator;
import com.java.ItemPriceComparator;

public class TestItems{

	public static void main(String[] args) {
		
		ArrayList<Item> items = new ArrayList<>();
		
		items.add(new Item(102,"Iphone",500));
		items.add(new Item(101,"blackberry",750));
		items.add(new Item(103,"samsug",520));
		items.add(new Item(108,"motog",800));
		
		
		//items sort on id
		//cant sort directly the parent class should implements
		//comapralbe interface and over ride compareTo
		//method
		
		//Collections.sort(items);//this is done using compareTO METHOD OVERIDING in the parent class as the 
		//list alone itself cant do that
		
		
		//Collections.sort(items, new ItemNameComparator());
		
		
		//anonymous class
//		Comparator<Item> comparator = new Comparator<Item>()
//				{
//					public int compare(Item i1, Item i2) 
//					{
//						return i1.getName().compareTo(i2.getName());
//						}
//				};
//		
//		Collections.sort(items,comparator);
//		
		
		
		
		
		
		// USING LAMBDAS...
		//Just implementing the method
		//reference variable is imp... parameter passing....return type
		Comparator<Item> comparator = (Item i1,Item i2) -> {return i1.getName().compareTo(i2.getName());};
		
		
		
		
		//we can directly pass the value into it
		//it takes only comparator refrence so its ok to pass directly
	
		
		//************IMP**************//
		//Collections.sort(items,(Item i1,Item i2) -> {return i1.getName().compareTo(i2.getName());});
		
		
		//if there are two or more statements in the return block
		//go for method references rather than lambda expressions
		
		
		
		
		
		
		
		//Collections.sort(items,comparator);
		
		//passing method reference
		Collections.sort(items,Item::comparePrice);
		
		
		for(Item item : items)
		{
			System.out.println("ID  :"+item.getID());
			System.out.println("Name:  "+item.getName());
			System.out.println("Price:  "+item.getPrice());
			System.out.println();
		}
		
		
		//Collections.sort(items);
		//items objects are not comparable
		//cant sort them
		//elements are not comparable
		

	}

}
