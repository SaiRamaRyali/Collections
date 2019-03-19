package com.java;
import java.util.HashSet;


public class TestHashSet {

	public static void main(String[] args) {
		
		
		HashSet<String> names2 = new HashSet<>();
		
		names2.add("sushi");
		names2.add("manu");
		names2.add("ram");
		//it wont throw any error
		//it simply ignore the element
		//if you print it you wont see
		names2.add("ram");
		names2.add("kranthi");
		
		//order will also be changed
		//insertion order is not followed
		//as they are not based on the index value
		for(String name : names2)
		{
			System.out.println(name);
		}
		String s1 = "Good Morning";
		//hashcode is defined in the object class
		//returns hashcode value
		System.out.println(s1.hashCode());
				
		
		

	}

}
