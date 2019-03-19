package com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class TestMapTask {

	public static void main(String[] args) {


		HashMap<String,List<String>> cityAndBranch = new HashMap<>();
		
		
		//Instead of arraylist we can go as list method in the array
		//which is util package
		cityAndBranch.put("Hyd",Arrays.asList(new String[] {"Avnt","Amp","ppk"}));
		cityAndBranch.put("Mum",Arrays.asList(new String[] {"CG","BM","LLK"}));
		cityAndBranch.put("Vizag",Arrays.asList(new String[] {"BR","NM","kl"}));

//		for (String name: cityAndBranch.keySet()){
//
//            String key =name.toString();
//            String value = cityAndBranch.get(name).toString();  
//            System.out.println(key + " : " + value);  
//}
		
		//printing the values...
		for (Entry<String, List<String>> obj : cityAndBranch.entrySet()) {
		    
		    System.out.print("Key: " + obj.getKey());
		    System.out.println(", Value: " + obj.getValue());
		}
		
		
		//Set<Entry<String,String>> entries = new cityAndBranch.entrySet();
		
		

		

	}

}
