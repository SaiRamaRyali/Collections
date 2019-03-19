package com.java;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		
		TreeMap<String,String> callingcode = new TreeMap<>();
	    
		//we have 3 entries and the size is 3
		
		callingcode.put("IND","091" );
		callingcode.put("US","001" );
		callingcode.put("UK","044" );
		callingcode.put("AUS","006" );
		callingcode.put("SING","066" );
		callingcode.put("CAN","001" );
		
		Set<Entry<String,String>> entries = callingcode.entrySet();
		
		for(Entry<String,String> entry : entries)
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
