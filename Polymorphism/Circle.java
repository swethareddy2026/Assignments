
public class Circle extends Shape {
	float radius;
	double pi = 3.142;
	
	public Circle(float radius)
	{
		this.radius = radius;
	}
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	@Override
	public double area()
	{
		double area = pi * this.getRadius() * this.getRadius();
		return area;
	}

	@Override
	public double perimeter()
	{
		double perimeter = 2 * pi *this.getRadius();
		return perimeter;
	}
	

}
