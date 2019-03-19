
public class Item {
	
	private int id;
	private String name;
	private float price;
	
	private Bid[] bidsArr;
	//bid odject references stored in the array
	//this is one to many association..
	//we can go to collections for the same purpose
	public Item()
	{
		
	}
	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
