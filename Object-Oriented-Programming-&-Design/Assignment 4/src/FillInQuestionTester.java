import java.util.Scanner;


public class FillInQuestionTester {
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		
		FillInQuestion q = new FillInQuestion();
		String FilledInQuestion = "Who was the inventor of Java? _James Gosling_";
		q.setTxt(FilledInQuestion);
		q.setAns(FilledInQuestion);
		q.display();
		System.out.print("your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	
	}
}
