
public class QuizScoreAnalyzer {

	public static void main(String[] args) {
		int [] quizScores = new int[] {85, 92, 78, 90, 88, 76, 95, 89};
		int highest = quizScores[0];
		int lowest = quizScores[0];
		double totalSum=0;
		double average=0;
		
		for(int i=1; i<quizScores.length; i++)
		{
			if(quizScores[i]>highest)
				highest=quizScores[i];
		}
		
		System.out.println("The highest number in the array is: " + highest);
		
		for(int i=1; i<quizScores.length; i++)
		{
			if(quizScores[i]<lowest)
				lowest = quizScores[i];
		}
		
		System.out.println("The Lowest number in the array is: " + lowest);
		
		for(int i=0; i<quizScores.length;i++)
		{
			totalSum+=quizScores[i];
		}
		 average = totalSum/quizScores.length;
		 System.out.println("The average of the array numbers is:" + average);
		 
		
	}

}
