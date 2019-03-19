package com.java;

public class Item  {
	
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
	
	

}
