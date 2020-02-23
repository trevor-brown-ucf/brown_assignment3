import java.security.SecureRandom;
import java.util.*;

public class CAI2
{
	public static void main(String[] args) 				// "Create a main method that runs your program by calling the "quiz" method"
	{
		quiz();
	}

	public static void quiz()							// "Create a method called "quiz" that contains the program logic"
	{
		SecureRandom secureRandom = new SecureRandom();
		int a = secureRandom.nextInt(10);				// "The program shall generate random numbers with a SecureRandom object"
		int b = secureRandom.nextInt(10);				// "A multiplication problem shall contain two numbers sampled from a uniform random distribution in the range of 0 to 9 (inclusive)"
		
		int correctAnswer = a * b;
		int studentAnswer =-1;
		
		while(true)										// "The program shall continue to ask the student to solve the original multiplication problem until the student provides the correct answer"
		{
			askQuestion(a,b);							// "The program shall ask the student to solve a multiplication problem"
			studentAnswer = readResponse();
			if (isAsnwerCorrect(correctAnswer,studentAnswer))
			{
				displayCorrectResponse();
				break;									// "The program shall terminate when a correct response is provided by the student"
			}
			else
			{
				displayIncorrectResponse();
			}
	  
		}
  
	}

	public static void askQuestion(int a, int b)	// "Create a method called "askQuestion" that prints the problem to the screen"
	{
		System.out.print("What is " + a + " times " + b + "? ");
	}
  
	public static int readResponse()					// "Create a method called "readResponse" that reads the answer from the student"
	{
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		return answer;		
	}
  
	public static boolean isAsnwerCorrect(int correctAnswer, int studentAnswer) // "Create a method called "isAnswerCorrect" that checks to see if the student's answer matches the correct answer to the problem"
	{
		return correctAnswer == studentAnswer;
	}
  
	public static void displayCorrectResponse()			// "Create a method called "displayCorrectResponse" that prints out the response when a student enters a correct answer"
	{
		SecureRandom secureRandom = new SecureRandom();	// "The program shall display a random positive message if the student provides a correct response"
		int rand = secureRandom.nextInt(4);
		switch (rand)									// "Use a switch statement to issue the responses."
		{
			case 0: System.out.println("Very good!");
					break;
			case 1: System.out.println("Excellent!");
					break;
			case 2: System.out.println("Nice work!");
					break;
			case 3: System.out.println("Keep up the good work!");
					break;
		}				
	}
  
	public static void displayIncorrectResponse()		// "Create a method called "displayIncorrectResponse" that prints out the response when a student enters an incorrect answer"
	{
		SecureRandom secureRandom = new SecureRandom();	// "The program shall display a random negative message if the student provides an incorrect response"
		int rand = secureRandom.nextInt(4);
		switch (rand)									// "Use a switch statement to issue the responses."
		{
			case 0: System.out.println("No. Please try again.");
					break;
			case 1: System.out.println("Wrong. Try once more.");
					break;
			case 2: System.out.println("Don’t give up!");
					break;
			case 3: System.out.println("No. Keep trying.");
					break;
		}
	}
}
