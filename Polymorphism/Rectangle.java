
public class Rectangle extends Shape {
	
	double width;
	double height;
	
	public Rectangle(double width, double height)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	@Override
	public double area()
	{
		double area = this.getHeight()*this.getWidth();
		return area;
	}

	@Override
	public double perimeter()
	{
		double perimeter = 2 * (this.getHeight()+this.getWidth());
		return perimeter;
	}
	
	
}
