
public class Shape {
	String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double area()
	{
		return 0;
	}

	public double perimeter()
	{
		return 0;
	}
	public void displayInfo()
	{
		System.out.println("The area is: " + this.area());
		System.out.println("The perimeter is: "+ this.perimeter());
		System.out.println();
	}
}
