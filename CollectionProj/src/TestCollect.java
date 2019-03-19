import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestCollect {

	public static void main(String[] args) {
		
		//size is not fixed
		//any number of sting elements can store
		//it is ArrayList collection class where elements are stored as ArrayList
		ArrayList<String> names = new ArrayList<>();
		
		
		//stored in linked list..
		//LinkedList<String> names1 = new LinkedList<>();
		
		
		//there will be collection interface which is the root interface
		// for all the collection methods like arrays and lists are defined
		
		
		
		
	
		
		//internally this uses arrayList data structures 
		names.add("Anil");
		names.add("Kumar");
		names.add("Anils");
		names.add("Gampa");
		names.add("Neha");
		names.add("Sukadia");
		
		//in array no method is there to find no of elements
		
		LinkedList<String> names2 = new LinkedList<>();
		names2.add("sushi");
		names2.add("manu");
		names2.add("sow");
		names2.add("ram");
		names2.add("kranthi");
		
		//sort method in collections..
		Collections.sort(names);
		
		for(String str : names)
		{
			System.out.println(str);
		}
		
		
		
		
		
		
		//For sublist mehtod it gives part of collections index to to from..
		
//		List<String> newlylist = names.subList(2, 5);
//		
//		for(String str : newlylist)
//		{
//			System.out.println(str);
//		}
//		
//		
		//exclusive list ops get,set,add
//		System.out.println(names.get(2));//get method exclusive in lists
//		
		//names2.set(2, "magadeera");
		
		//it wont replace it will just  add by moving "manu" to nect index
//		names2.add(2, "magadeera");
		
		
		
		
		
//		Iterator<String> iterators = names2.iterator();
//		
//		while(iterators.hasNext())//hasNext check if there is element after the cursor
//		{
//			System.out.println(iterators.next());
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
		
		//adding second collections elements to first
		
		
	//	names.addAll(names2);//add elements 
		//lists duplicates are fine
		
	//	names.removeAll(names2);
		//common elements are deleted from the first collection
		//all the duplicates also gone..
		
		
		//names.retainAll(names2);
		//only retains the common elements
		
	//	System.out.println(names.containsAll(names2));
		//all the elements of the second collection present in the first
		//collection or not
		
		//Object[]objarr = names.toArray();
		
		//	for(Object obj:objarr)
		//{
		//	String str = (String)obj;
			
			//System.out.println(str);
		//}
		
		
		
		//converting directly to string array by overriding toarray
		//method.
		
//		String[] namesArray = new String[names.size()];
//		
//		names.toArray(namesArray);
//		
//		for(String str : namesArray)
//		{
//			System.out.println(str);
//		}
//		
//		
//		//but in collection there is a predefined method for that
//		System.out.println(names.size());
//		
//		//whether the particular name is contains or not
//		System.out.println(names.contains("Kumar"));

	}

}
