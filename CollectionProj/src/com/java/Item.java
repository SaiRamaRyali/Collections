package com.java;

import java.util.Comparator;

public class Item implements Comparable<Item>, Comparator<Item> {
	
	private int ID;
	
	private String name;
	
	private float price;
	
	public Item()
	{
		
	}
	public Item(int iD, String name, float price) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
	}

	//sorting on id...(sort on only one element)
	//overriding the compareTo method by implementing comparable class of item
	public int compareTo(Item i2) {
		//compare case will be written with two elements
		if(this.ID > i2.ID)
			return 1;
		else if(this.ID < i2.ID)
			return -1;
		
		return 0;
	}

	// A user defined method...
	static public int comparePrice(Item i1,Item i2)
	{
		if(i1.price > i2.price)
			return 1;
		else if(i1.price < i2.price)
			return -1;
		
		return 0;
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		if(ID>0)
			{
				this.ID = iD;
				return;//even though it is void..why is this: we are just return the control back to the calling method
						//method stop there and contrl will change. wont execute there after
			}
		else
			{
				System.err.println("Invalid ID");
			}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public int compare(Item i1, Item i2) {
		return i1.getName().compareTo(i2.getName());
	}
}
