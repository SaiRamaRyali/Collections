import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		//key,calling code
		HashMap<String,String> callingcode = new HashMap<>();
    
		//we have 3 entries and the size is 3
		
		callingcode.put("IND","091" );
		callingcode.put("US","001" );
		callingcode.put("UK","044" );

		//get method in maps
		System.out.println(callingcode.get("US"));
		
		HashMap<String,String> callingcode2 = new HashMap<>();
		
		callingcode2.put("AUS","006" );
		callingcode2.put("SING","066" );
		callingcode2.put("CAN","001" );

		//add one map to another map
		//all the 2 collection will add to first
		//size will be 6
		callingcode.putAll(callingcode2);
		
		//reads all the keys and keep them in sets
		//.keyset method
		Set<String> str = callingcode.keySet();
		
		for(String st : str)
		{
			System.out.println(st);
		}
		
		//entry set method
		//for each entry one object is created and stored in sets
		Set<Entry<String,String>> entries = callingcode.entrySet();
		
		for(Entry<String,String> entry : entries)
		{
			//read the key and value
			
			//finally we are reading the key and value
			
			
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		
	}

}
