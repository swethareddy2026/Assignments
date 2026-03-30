
public class ControlFlowsandLoops {

	public static void main(String[] args) {
		forloop(7);
		System.out.println();
		whileLoop();
		System.out.println();
		nestedLoop(5);

	}

	// method to print 7 multiplication table using for loop
	public static void forloop(int i) {
		System.out.println("The multiplication table of " + i +"\n");
		for (int j = 1; j <= 10; j++) {
			System.out.println(i + " * " + j + " = " + i * j);
		}
	}
	
	//method for printing the first number whose square is greater than 500 using while loop
	public static void whileLoop() {
		int i = 0;
		int j = 0;

		while (!(j > 500)) {
			i++;
			j = i * i;
		}
		System.out.println("the first number greater than 1 and whose square is greater than 500 is " + i);
	}
	
	//method to print * in a right angled triangle shape using nested loop
	public static void nestedLoop(int rows)
	{
		for(int i=1; i<=rows;i++)
		{
			for (int j=0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
