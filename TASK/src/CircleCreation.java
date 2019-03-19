
public class CircleCreation {
	
	double radius;
	double area;
	double circumference;
	
	public CircleCreation()
	{
		
	}
	
	
	public CircleCreation(double radius)
	{
		this.radius = radius;
	}
	
	
	public void DrawAreaCircle(double radius)
	{
		//area = Math.PI * radius * radius;
		area = Math.PI * Math.pow(radius, 2);
	}
	public void DrawCircumferenceCircle(double radius)
	{
		circumference = 2 * Math.PI * radius;
	}

}
