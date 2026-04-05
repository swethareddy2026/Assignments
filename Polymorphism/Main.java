
public class Main {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Rectangle(5, 8);
		shapes[1] = new Triangle(2,2,2,2,2);
		shapes[2] = new Square(4);
		shapes[3] = new Circle(4);

		for(Shape s: shapes)
		{
			s.displayInfo();
		}
	}

}
