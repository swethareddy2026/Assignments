
public class SubjectMarks {

	//7th question in the assignment
	public static void main(String[] args) {
		int math = 95;
		int science = 85;
		int history = 90;
		int english = 78;
		int java = 67;

		//calculate total
		int total = math + science + history + english + java;
		// calculate percentage
		float percentage = total / 5;
		
		System.out.println("Math:" + math + "\t\tScience: " + science + "\tHistory: " + history + "\tEnglish: "
				+ english + "\tJava: " + java);
		System.out.println("Total:\t" + total); 
		System.out.println("Percentage: " + percentage + "%"); 

		//if else statements to find grade
		if (percentage >= 90) {
			System.out.println("Grade: A+");

		} else if (percentage >= 80) {
			System.out.println("Grade: A");

		} else if (percentage >= 70) {
			System.out.println("Grade: B");

		} else if (percentage >= 60) {
			System.out.println("Grade: C");

		} else if (percentage >= 50) {
			System.out.println("Grade: D");

		} else {
			System.out.println("Grade: F");

		}
		//to find if the student has passed all the subjects or failed.
		String status = ((math>=40 && science>=40 && english>=40 && history>=40 && java>=40)? "Pass":"Fail");
		System.out.println("Status: " + status);
		
		//to find if the student is eligible for scholarship or not
		System.out.println((percentage>=85 && status == "Pass") ? "Scholarship: Eligible for Merit Scholarship": "Scholarship: Not Eligible (below 85%)");
		
		//to find the highest marks
		if (math >=science && math >=english && math>=history && math>=java)
		{
			System.out.println("Math is highest");
		}
		else if(science >=math && science >=english && science>=history && science>=java)
		{
			System.out.println("Science is highest");
		}
				
		else if(english >=math && english >=science && english>=history && english>=java)
		{
			System.out.println("English is highest");
		}
		else if(history >=math && history >=english && history>=science && history>=java)
		{
			System.out.println("History is highest");
		}
		else
		{
			System.out.println("Java is highest");
		}
		
		//to find the lowest marks
				if (math <=science && math <=english && math<=history && math<=java)
				{
					System.out.println("Math is lowest");
				}
				else if(science <=math && science <=english && science<=history && science<=java)
				{
					System.out.println("Science is lowest");
				}
						
				else if(english <=math && english <=science && english<=history && english<=java)
				{
					System.out.println("English is lowest");
				}
				else if(history <=math && history <=english && history<=science && history<=java)
				{
					System.out.println("History is lowest");
				}
				else
				{
					System.out.println("Java is lowest");
				}
	}
}
