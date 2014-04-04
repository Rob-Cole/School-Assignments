import java.util.Scanner;
 

public class q6_16 {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter an integer: ");
		
		int len = sc.nextInt();
		String line = "*";
		
		
		
		for (int count = 0; count <= (2*len-2); count++)
		{
		int space = 0;
		
		
			// spaces
			while (space < Math.abs(len-1-count)){
				System.out.print(" ");
				space ++;
				
			}
			
			// star
			if (count < len-1){
			System.out.println(line);
			line += "**";
			}
			else {
				System.out.println(line);
				if (line.length() > 1){
					line = line.substring(1);
					line = line.substring(1);
				}
				
			}
			
		}
	}
}
