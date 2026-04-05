
public class Square extends Rectangle {
	double side;

	public Square(double side) {
		super(side, side);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double area()
	{
		double area =  this.getSide()*this.getSide();
		return area;
	}

	@Override
	public double perimeter()
	{
		double perimeter = 4 * this.getSide();
		return perimeter;
	}
	
}
