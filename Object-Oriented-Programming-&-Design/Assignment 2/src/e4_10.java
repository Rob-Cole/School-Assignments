import java.util.Scanner;

public class e4_10 {
	public static void main(String[] args)
	{
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter the number of gallons of gas in the tank: ");
	double gallons = sc.nextDouble();
	
	System.out.print("Please enter the fuel effiency in miles per gallon: ");
	double F_E = sc.nextDouble();
	
	System.out.print("Please enter the price of gas per gallon: ");
	double gasPrice = sc.nextDouble();
	
	System.out.println("The cost of gas per 100 miles is $" + ((100 / F_E)*gasPrice));
	System.out.println("With the current amount of gas in the car, you can travel " + (F_E * gallons) + " miles.");
	
	
	
	}
	
	
}
