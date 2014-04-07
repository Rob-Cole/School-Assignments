import java.util.Scanner;

public class Input {
	
	public static int readIn (Scanner in, String prompt, String error, int min, int max){
		System.out.print(prompt);

		int input = in.nextInt();
		
		//repeats until the user inputs a valid number in the range
		while (input > max || input < min){ 
			System.out.println(error);
			System.out.print(prompt);
			input = in.nextInt();
		}
		
		return input;
	}

	//Testing the class
	
public static void main(String [] args){ 
	
	String prompt = "please enter an int between 1 and 5: ";
	String error = "That is not a valid number.";
	int min = 0;
	int max = 11;
	Scanner in = new Scanner(System.in);
	System.out.print(readIn(in, prompt, error, min, max));
	
	}

}